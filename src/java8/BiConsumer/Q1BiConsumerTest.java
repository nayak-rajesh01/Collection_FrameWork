package java8.BiConsumer;
import java.util.function.BiConsumer;
public class Q1BiConsumerTest {
    public static void main(String[] args)
    {   //Using integer value
        BiConsumer<Integer, Integer> biConsumer1 = (num1, num2) -> {num1 = num1 + num2;};
        biConsumer1.accept(1, 2);
        //Using String value
        BiConsumer<String, String> biConsumer2 = (name , age) ->
        {
            System.out.println("Name : " + name + "\n Age : " + age);
        };
        biConsumer2.accept("Rajesh","24");
    }
}

