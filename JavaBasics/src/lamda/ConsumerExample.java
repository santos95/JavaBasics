package lamda;

import org.w3c.dom.ls.LSOutput;

import java.beans.Customizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> dummyToUppercase = value -> {
            System.out.println(value.toUpperCase());
        };

        dummyToUppercase.accept("hello there Santi!!!!");
        System.out.println("-----------------------------------------------");

        BiConsumer<String, String> dummyCreateFullName = (fName, lName) -> {
            System.out.println("-----------------------------------------------");
            System.out.println("dummyCreateFullName - lamda expression");
            System.out.println(fName.toUpperCase().concat(" ").concat(lName.toUpperCase()));
            System.out.println("-----------------------------------------------");
        };

        dummyCreateFullName.accept("peter", "parker");

        SuperHero ironMan = new SuperHero("Tony", "Startk", 29);

        dummyCreateFullName.accept(ironMan.getFirstName(), ironMan.getLastName());

        Consumer<String> stringConsumer = hello -> System.out.println(hello);

        stringConsumer.accept("Hello there");

        Consumer<Date> dateConsumer = date -> {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(format.format(date));
        };

        dateConsumer.accept(new Date());

        BiConsumer<String, Integer> user = (name, age) -> {
            System.out.println("Name: " + name + " Edad: " + age);
        };

        user.accept("Santos Ortiz", 27);

        BiConsumer<String, PersonType> entidad = (nombreComercial, tipo) -> {
            System.out.println(nombreComercial + " del tipo " + tipo);
        };

        entidad.accept("Daniken y los Giorgios S.A", PersonType.NATURAL);

        //SIMPLIFICAR A UNA LINEA USANDO METHOD REFERENCE
        Consumer<String> consumerMessage = System.out::println;
        consumerMessage.accept("Hello There! - General Kenobi!");

        List<String> friends = Arrays.asList("Peter", "Josa", "Xavier");

        friends.forEach(consumerMessage);

        User user1 = new User();

        BiConsumer<User, String> userConsumer = (someUser, username) -> {
            someUser.setUsername(username);
        };
        userConsumer.accept(user1, "sortiz");
        System.out.println(user1);
        //Simplificar lo anterior donde se asume que el primero, un objeto luego recibe al segundo como argumento para el metodo
        BiConsumer<User, String> userEmailConsumer = User::setEmail;
        userEmailConsumer.accept(user1, "sortiz@gmail.com");
        System.out.println(user1);

        Supplier<String> stringSupplier = () -> {
            return "Hello there - Obi Wan kenobi";
        };

        System.out.println(stringSupplier.get());

        Supplier<User> createUser = () -> {
            return new User();
        };

        User user2 = createUser.get();
        userConsumer.accept(user2, "daniken95");
        userEmailConsumer.accept(user2, "daniken95@gmail.com");
        System.out.println(user2);

        Supplier<User> createUser2 = User::new;
        User user3 = createUser.get();
        userConsumer.accept(user3, "daniken95");
        userEmailConsumer.accept(user3, "daniken95@gmail.com");
        System.out.println(user3);


        //*
        // USE LAMDA EXPRESSION TO PRINT A LIST OF AN OBJECT
        // */
        System.out.println("Print with foreach and using a lamda function");
        
        List<SuperHero> avengers = new ArrayList<>();

        avengers.add(new SuperHero("Steve", "Rogers", 90));
        avengers.add(new SuperHero("Tony", "Stark", 30));
        avengers.add(new SuperHero("Peter", "Parker", 20));
        avengers.add(new SuperHero("Hank", "Pynm", 30));

        BiConsumer<String, String> superHero = (fName, lName) -> {
            System.out.println(fName.toUpperCase().concat(" ").concat(lName));
        };

        avengers.forEach(avenger -> {
            superHero.accept(avenger.getFirstName(), avenger.getLastName());
        });

    }
}
