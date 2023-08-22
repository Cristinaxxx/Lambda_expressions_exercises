package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("Zoe");
        nameList.add("Robert");
        nameList.add("Angela");
        nameList.add("Sara");
        nameList.add("John");

        nameList.stream()
                .sorted()
                .forEach(name -> System.out.println(name));

    }
}