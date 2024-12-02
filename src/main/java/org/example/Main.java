package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> names = List.of(
                "Amir",
                "Hatef",
                "Mehran",
                "Mojtaba",
                "Mohammad",
                "Ali",
                "Davood",
                "Reza",
                "Mohsen"
        );
        List<String> sentence = List.of(
                "Amir hadi asghar",
                "Hatef ali",
                "Mehran hasan hossein",
                "Mojtaba",
                "Mohammad",
                "Ali karim",
                "Davood mana",
                "Reza razieh razi",
                "Mohsen"
        );

        GroupingBasedOnTheirLength(names).forEach((k, v) -> System.out.println(k + " " + v));
        wordCounter(sentence).forEach((k, v) -> System.out.println(k + " " + v));
    }

    public static Map<Integer, List<String>> GroupingBasedOnTheirLength(List<String> names) {
        return names.stream().collect(Collectors.groupingBy(String::length));
    }

    public static Map<Integer, List<String>> wordCounter(List<String> stringList) {
        return stringList.stream().collect(Collectors.groupingBy(s -> s.split(" ").length,
                HashMap::new,
                Collectors.toList()));
    }
}