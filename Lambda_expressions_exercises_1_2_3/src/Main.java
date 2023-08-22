import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        System.out.println(sumOfTwoIntegersBiFunction.apply(2, 3));      // Exercise 1
        System.out.println(isStringEmptyPredicate.test("Hello world"));     // Exercise 2
        System.out.println(isStringEmptyPredicate.test(""));                // Exercise 2

        List<String> myStringList = new ArrayList<>();                        // Exercise 3
        myStringList.add("Hello");
        myStringList.add("How");
        myStringList.add("Are");
        myStringList.add("You");

        myStringList.forEach(System.out::println);

        myStringList.replaceAll(words -> words.toLowerCase());
        myStringList.forEach(System.out::println);

        myStringList.replaceAll(words -> words.toUpperCase());
        myStringList.forEach(System.out::println);

    }

    // Exercise 1: normal Java method
    static int sumOfTwoIntegers(int number1, int number2) {
        return number1 + number2;
    }

    // Same as above but with BiFunction
    static BiFunction<Integer, Integer, Integer> sumOfTwoIntegersBiFunction =
            (number1, number2) -> number1 + number2;


    // Exercise 2: normal Java method
    static boolean isStringEmpty(String stringToCheck) {
        return stringToCheck.isEmpty();
    }

    // Same but with predicate
    static Predicate<String> isStringEmptyPredicate = stringToCheck ->
            stringToCheck.isEmpty();



}