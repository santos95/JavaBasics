package lamda;

import org.w3c.dom.ls.LSOutput;

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

        Supplier<String> stringSupplier = () -> {return "Hello there - Obi Wan kenobi";};
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




    }
}
