package java8.unaryOperator;

import java.util.function.UnaryOperator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Q1UnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<String> toUpper = str -> str.toUpperCase();

        System.out.println(toUpper.apply("java")); // Output: JAVA

        UnaryOperator<Integer> increment = x -> x + 1;

        System.out.println(increment.apply(10)); // Output: 11


        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        UnaryOperator<Integer> doubleValue = x -> x * 2;

        list.replaceAll(doubleValue);

        System.out.println(list); // Output: [2, 4, 6, 8]


    }
}
