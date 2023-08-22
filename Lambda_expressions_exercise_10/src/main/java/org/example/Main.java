package org.example;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        System.out.println(concatenateTwoStringsBiFunction.apply("Hello ", "world"));
        System.out.println(concatenateTwoStrings("Hi, ", "how are you?"));

    }

    static BiFunction<String, String, String> concatenateTwoStringsBiFunction =
            (one, two) -> one + two;

    static String concatenateTwoStrings(String one, String two) {
        return one + two;
    }


}