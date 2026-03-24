//Q8: Convert list of strings to lowercase
package java8.forEachFunction.projects.easy;
import java.util.*;
public class Q8 {
    public static void main(String[] args)
    {
        List<String> ls1 = new ArrayList<>();
        ls1.add("Rajesh Kumar Nayak");
        ls1.add("Rajesh Kumar Nayak1");
        ls1.add("Rajesh Kumar Nayak2");
        ls1.add("Rajesh Kumar Nayak3");
        ls1.stream().forEach(n-> System.out.println(n.toLowerCase()));
        System.out.println();
        System.out.println(ls1);
    }
}
