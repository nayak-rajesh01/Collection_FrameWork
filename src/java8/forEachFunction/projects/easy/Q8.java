package java8.forEachFunction.projects.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q8 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("JAVA", "PYTHON", "C++", "JAVASCRIPT");
        System.out.println(list);
        // using only forEach function mycode
        List<String> ls1 = new ArrayList<>();
        list.forEach(s-> ls1.add(s.toUpperCase()));
        System.out.println(ls1);

        // chatGpt using stream() interface
        ArrayList<String> list1  = new ArrayList<>();
        list.stream().forEach(str -> list1.add(str.toLowerCase()));
        System.out.println(list1);
    }
}