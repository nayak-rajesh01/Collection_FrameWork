package java8.forEachFunction.projects.easy;

import java.util.*;
import java.util.stream.Collectors;

public class Q15 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(50, 20, 40, 10, 30);

        List<Integer> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);

        //One-Liner
        List<Integer> list1 = Arrays.asList(50, 20, 40, 10, 30);
        System.out.println(list1.stream().sorted().toList());

//        3. Without Stream (Collections)
        List<Integer> list2 = Arrays.asList(50, 20, 40, 10, 30);
        Collections.sort(list);
        System.out.println(list);

        //1. Sort in descending order
        List<Integer> list3 = Arrays.asList(50, 20, 40, 10, 30);
        list3.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        //2. Sort list of strings
        List<String> list4 = Arrays.asList("Amit","Rahul","Gandhi","rajesh");
        list4.stream()
                .sorted()
                .toList();

        //Sort objects (Important ⭐)
        /*
        employees.stream()
         .sorted(Comparator.comparing(Employee::getSalary))
         .toList();
         */



    }
}