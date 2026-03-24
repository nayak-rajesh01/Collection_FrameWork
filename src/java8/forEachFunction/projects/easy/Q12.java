package java8.forEachFunction.projects.easy;

import java.util.*;

public class Q12 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 55, 20, 75, 30, 90, 45);

        Optional<Integer> max = list.stream()
                .max(Integer::compareTo);

        max.ifPresent(m -> System.out.println("Max element: " + m));
    }
}