package java8.forEachFunction.projects.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q13 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 55, 20, 75, 30, 90, 45);

        Optional<Integer> min = list.stream()
                .min(Integer::compareTo);

        min.ifPresent(m -> System.out.println("Min element: " + m));
    }
}
