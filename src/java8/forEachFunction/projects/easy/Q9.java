//9. Filter elements greater than 50
package java8.forEachFunction.projects.easy;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q9 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 55, 20, 75, 30, 90, 45);

        List<Integer> result = list.stream()
                .filter(n -> n > 50)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
