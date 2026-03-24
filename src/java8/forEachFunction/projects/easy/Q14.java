package java8.forEachFunction.projects.easy;

import java.util.*;
import java.util.stream.Collectors;

public class Q14 {
    public static void main(String[] args) {

        // Best Approach (Stream API ⭐)
        List<Integer> list = Arrays.asList(10, 20, 20, 30, 40, 40, 50);

        List<Integer> uniqueList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueList);

        // One-Liner
        List<Integer> list1 = Arrays.asList(10, 20, 20, 30, 40, 40, 50);
        System.out.println(list1.stream().distinct().toList());

        // Using Set (Alternative)
        List<Integer> list2 = Arrays.asList(10, 20, 20, 30, 40, 40, 50);
        Set<Integer> set = new HashSet<>(list2);
        System.out.println(set);

        // Remove duplicates and sort
        List<Integer> list3 = Arrays.asList(10, 20, 20, 30, 40, 40, 50);
        list3.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println(list3);

        /*
        2. Remove duplicates from objects
         employees.stream()
         .distinct()
         .toList();
         */

        //Count unique elements
        List<Integer> list4 = Arrays.asList(10, 20, 20, 30, 40, 40, 50);
        long count = list4.stream().distinct().count();
    }
}