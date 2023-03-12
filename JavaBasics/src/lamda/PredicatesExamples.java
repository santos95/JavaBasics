package lamda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicatesExamples {

    public static void main(String[] args) {

        Predicate<Integer> test = n -> n > 10;
        System.out.println(test.test(10));

        Predicate<String> dummyRolComparator = rol -> rol.equals("ADMIN");
        System.out.println(dummyRolComparator.test("DEVELOPER"));

        BiPredicate<String, String> dummyBiComparator = String::equals;
        System.out.println(dummyBiComparator.test("Santos", "Alberto"));
        System.out.println(dummyBiComparator.test("Santos", "Santos"));



    }
}
