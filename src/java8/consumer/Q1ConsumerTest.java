package java8.consumer;
import java.util.function.Consumer;
public class Q1ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> con1= (name)->
        {
            System.out.println(name);
        };
        con1.accept("Rajesh");

        // Other Way
        Consumer<String> con2= (name)->System.out.println(name);
        con2.accept("Kumar");
    }
}
