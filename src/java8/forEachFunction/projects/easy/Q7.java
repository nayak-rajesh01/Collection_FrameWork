//Convert list of strings to uppercase
package java8.forEachFunction.projects.easy;
import java.util.*;
public class Q7 {
    public static void main(String[] args)
    {
        List<String> ls1 = new ArrayList<>();
        ls1.add("rajesh");
        ls1.add("rajesh");
        ls1.add("rajesh");
        ls1.add("rajesh");
        ls1.add("rajesh");
        ls1.add("rajesh");
        ls1.add("rajesh");
        ls1.stream().forEach(n-> System.out.print(n.toUpperCase()));
        System.out.println();
        System.out.println(ls1);
    }
}
