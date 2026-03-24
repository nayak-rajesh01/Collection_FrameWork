//5. Find average of list
package java8.forEachFunction.projects.easy;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Q5 {
    public static void main(String[] args)
    {   //Correct Code (Using forEach)
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        list.forEach(n -> {
            int sum = 0,count = 0;
            for (int i : list) {
                sum += i;
                count++;
            }
            System.out.println("sum = " + sum);
            System.out.println("count = " + count);
            System.out.println("Average = " + sum/count);
        });

    }
}
