package java8.forEachFunction;
import java.util.*;
class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        // Example 1: Basic forEach with Lambda
        list.forEach(n -> System.out.println(n));

        //Example 2: Using Method Reference
        list.forEach(System.out::println);

        //Example 3: forEach with Custom Logic
        list.forEach(n->
        {
            if(n%2==0)
            {
                System.out.println(n);
            }
        });

        //Example 4: forEach with Map
        // Create Map
        Map<Integer, String> map = new HashMap<>();

        // Add elements
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // Using forEach (Java 8)
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

    }
}
