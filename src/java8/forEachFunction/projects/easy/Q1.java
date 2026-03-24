// Q1: 1. Print all elements using forEach
package java8.forEachFunction.projects.easy;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Q1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        list.forEach(System.out::println);
        System.out.println("=================================");
        list.forEach(n->System.out.println(n));
    }
}
