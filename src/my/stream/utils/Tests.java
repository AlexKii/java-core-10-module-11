package my.stream.utils;

import java.util.*;
import java.util.stream.Collectors;


public class Tests {

    private static final List<String> NAMES =
            Arrays.asList("Ivan", "Alla", "Petro", "Svitlana", "Andriy", "Olena", "Sergii", "Nika", "Oles", "Maria", "Taras",
                    "Katerina", "Mykola", "Tetyana", "Vitalii", "Oksana", "Kostya", "Sofia", "Egor", "Zina", "Oleg");

    private static final String[] NUMBERS = {"1, 2, 0", "7, 5", "3, 9", "8, 4, 6"};

    public static void main(String[] args) {

        //task 1
        System.out.println(MyStreamUtils.oddIndexNamesGet(NAMES));

        //task 2
        System.out.println(MyStreamUtils.upperCaseAndReversSort(NAMES));

        //task 3
        System.out.println(MyStreamUtils.weirdArraysNumbersGetAndSort(NUMBERS));

        //task 4
        System.out.println(MyStreamUtils.linearCongruentialGeneration(25214903917l, 11l, 2^48l));

        //task 5
        System.out.println(MyStreamUtils.zip(NAMES.stream(), Arrays.stream(NUMBERS)).collect(Collectors.toList()));

    }
}
