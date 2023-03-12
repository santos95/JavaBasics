package lamda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<String, String> func1 = param -> "Hello There " + param;
        System.out.println(func1.apply("Santi"));

        Function<String, String> dummyToUpper = String::toUpperCase;
        System.out.println(dummyToUpper.apply("Santos Ortiz"));

//        Bi function two arguments input and one output
        BiFunction<String, String, String> dummyUpperCaseBi = (s1, s2) ->
            s1.toUpperCase().concat(" ").concat(s2.toUpperCase());

        System.out.println(dummyUpperCaseBi.apply("peter", "parker"));

        BiFunction<String, String, Integer> dummyStringComparator = String::compareTo;
        System.out.println(dummyStringComparator.apply("Peter Quill", "Peter Parker"));
        System.out.println(dummyStringComparator.apply("Peter Parker", "Peter Parker"));

        BiFunction<String, String, String> dummyConcat = String::concat;
        System.out.println(dummyConcat.apply("Peter", "Parker"));

    }
}
