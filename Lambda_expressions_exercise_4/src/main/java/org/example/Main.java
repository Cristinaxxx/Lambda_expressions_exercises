package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Integer> myIntegerList = new ArrayList<>();      // Exercise 4
        myIntegerList.add(1);
        myIntegerList.add(4);
        myIntegerList.add(5);
        myIntegerList.add(8);
        myIntegerList.add(9);

    /*    for(int number : myIntegerList) {                Tried without streams but
            isNumberEvenPredicate.test(number);            not sure how to print this...
        }  */

        System.out.println("Even numbers");
        myIntegerList.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Odd numbers");
        myIntegerList.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);


    }

 /*   static boolean isNumberEven(int number) {        // Normal Java method
        return number % 2 == 0;
    }  */

    static Predicate<Integer> isNumberEvenPredicate = number -> number % 2 == 0;


}