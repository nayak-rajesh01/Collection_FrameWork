//10. Find first element in list
package java8.forEachFunction.projects.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q10 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> first = list.stream().findFirst();

        if (first.isPresent()) {
            System.out.println("First element: " + first.get());
        }
    }
}