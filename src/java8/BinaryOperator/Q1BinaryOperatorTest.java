package java8.BinaryOperator;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.List;

public class Q1BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(10, 20));

        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        System.out.println(list);
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());

        for(Integer integer : list){
            System.out.println(" ");
            System.out.println(integer);
        }
        System.out.println("=================================");
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        list.forEach(x -> System.out.println(x));
    }

}
