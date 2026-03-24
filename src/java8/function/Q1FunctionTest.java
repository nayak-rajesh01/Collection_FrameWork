package java8.function;
import java.util.function.Function;
public class Q1FunctionTest {
    public static void main(String[] args)
    {
        Function<String, Integer> f1 = (name)->
        {
            return name.length();
        };
        System.out.println(f1.apply("hello"));

        Function<String, Integer> f2 = (name)->name.length();
        System.out.println(f2.apply("RAJESH KUMAR NAYAK"));

        // remove space

        Function<String, Integer> f3 = (name) -> name.replace(" ", "").length();
        System.out.println(f3.apply("RAJESH KUMAR NAYAK"));

    }
}
