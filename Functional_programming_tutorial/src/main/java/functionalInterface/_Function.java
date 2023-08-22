package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        // Function:
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        // here we combine the two functions together:
        incrementByOneFunction.andThen(multiplyBy10Function);

        // we can extract this to a variable:
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);

        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        // BiFunction:
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));



    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;  // same thing as below!

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int incrementByOne(int number) {     // we need to go from this to functional programming: the equivalent
        return number + 1;                      // is Function<T,R>: a function that accepts one argument and produces
    }                                           // one result



    // this static method can be written as a BiFunction:
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

    // BiFunction that does the same as the static method above:
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

}
