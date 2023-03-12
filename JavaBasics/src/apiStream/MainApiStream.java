package apiStream;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApiStream {
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        Stream<String> names = Stream
                .of("Ozymandias", "Spiderman", "Cyclops")
                .peek(System.out::println)
                .map(n ->{
                    return n.toUpperCase();
                });
        names.forEach(System.out::println);

//        a partir de un arreglo
        System.out.println("----------------------------------");
        String arr[] = {"John", "Peter", "Scoth", "Tony", "Steve", "Matt"};
        Stream<String> names1 = Arrays.stream(arr);
        names1.map(String::toUpperCase)
              .peek(System.out::println)
              .map(String::toLowerCase);
        names1.forEach(System.out::println);

//        Stream builder
        System.out.println("----------------------------------");
//        Stream<String> names2 = Stream.builder()
//                .add("Peter")
//                .add("John")
//                .add("Norman")
//                .build();

//        List<String> result = names2.collect(Collectors.toList());
//        names2.forEach(System.out::println);

//        List
        System.out.println("----------------------------------");
        List<String> namesList = new ArrayList<>();
        namesList.add("Peter");
        namesList.add("John");
        namesList.add("Steve");
        namesList.add("Sthephen");
        namesList.add("Charles");
        namesList.forEach(System.out::println);



    }
}
