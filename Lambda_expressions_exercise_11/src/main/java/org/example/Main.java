package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        List<Integer> myIntegerList = new ArrayList<>();
        myIntegerList.add(2);
        myIntegerList.add(96);
        myIntegerList.add(10);
        myIntegerList.add(21);
        myIntegerList.add(5);

        int max = myIntegerList.stream()
                .mapToInt(n -> n.intValue())
                .max()                                         // method .min() to find the minimum
                .orElseThrow(NoSuchElementException::new);

        // had problems with this: don't understand why it doesn't work without the final line,
        // and why it gave me problems with the data type (int, Integer, OptionalInt)

        System.out.println(max);

    }


}