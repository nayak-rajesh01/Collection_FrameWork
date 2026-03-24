//Count total elements using stream
package java8.forEachFunction.projects.easy;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
public class Q6 {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println((long) list.size());
        System.out.println(list.stream().count());
    }
}
