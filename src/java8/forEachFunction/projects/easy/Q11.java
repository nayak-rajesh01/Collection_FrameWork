package java8.forEachFunction.projects.easy;

import java.util.*;

public class Q11 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // try empty list

        Optional<Integer> first = list.stream().findFirst();

        if (first.isPresent()) {
            System.out.println("List is NOT empty");
        } else {
            System.out.println("List is EMPTY");
        }
    }
}