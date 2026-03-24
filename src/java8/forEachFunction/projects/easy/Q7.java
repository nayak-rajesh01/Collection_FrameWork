//Convert list of strings to uppercase
package java8.forEachFunction.projects.easy;
import java.util.*;
public class Q7 {
    public static void main(String[] args)
    {
        List<String> ls1 = Arrays.asList("java", "python", "c++", "javascript");
        //My
        // Only to convert uppercase not to store
        ls1.stream().forEach(n-> System.out.print(n.toUpperCase()));
        System.out.println();
        System.out.println(ls1);
        // to store a new list using stream interface
        List<String> ls2 = new ArrayList<>();
        ls1.stream().forEach(str -> ls2.add(str.toUpperCase()));



        // ChatGpt
        List<String> upperList = new ArrayList<>();

        ls1.forEach(str -> upperList.add(str.toUpperCase()));

        System.out.println(upperList);
    }
}
