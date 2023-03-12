package apiStream;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApiStreamNameUser {
    public static void main(String[] args) {
        Stream<User> names = Stream
                .of("Santos Ortiz", "Peter Parker", "John Connor", "Peter Quill", "Joseph Joestar")
                .peek(System.out::println)
                .map(u -> new User(u.split(" ")[0], u.split(" ")[1]))
                .map(u -> {
                   String name = u.getFirstName().toUpperCase();
                   u.setFirstName(name);
                   return u;
                })
                .peek(System.out::println)
                .map(u -> {
                    String lastName = u.getLastName().toLowerCase();
                    u.setLastName(lastName);
                    return u;
                });
        names.forEach(System.out::println);

        System.out.println("===============================================================");
        System.out.println("Single filter");
        System.out.println("===============================================================");

        Stream<User> namesFilter = Stream
                .of("Santos Ortiz", "Peter Parker", "John Connor", "Peter Quill", "Joseph Joestar")
                .peek(System.out::println)
                .map(u -> new User(u.split(" ")[0], u.split(" ")[1]))
                .filter(u -> u.getFirstName().equals("Peter"));

        List<User> userList = namesFilter.collect(Collectors.toList());
        userList.forEach(System.out::println);
    }
}
