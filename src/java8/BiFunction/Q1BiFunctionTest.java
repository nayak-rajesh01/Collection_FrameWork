package java8.BiFunction;
import java.util.function.BiFunction;

public class Q1BiFunctionTest {
    public static void main(String[] args)
    {   //String add
        BiFunction<String, String, String> biFunction1 = (str1, str2) -> str1 + str2;
        System.out.println(biFunction1.apply("a", "b"));
        //Integer add
        BiFunction<Integer, Integer, Integer> biFunction2 = (num1, num2) -> num1 + num2;
        System.out.println(biFunction2.apply(1, 2));
    }
}
