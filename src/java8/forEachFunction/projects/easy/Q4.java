//4. Find sum of all elements
package java8.forEachFunction.projects.easy;
import java.util.Arrays;
import java.util.List;
public class Q4 {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        //My code
        list.forEach(n ->
        {
            int sum = 0;
            for(Integer i : list){
                sum += i;
            }
            System.out.println("sum = " + sum);
        }
        );


        //Correct Code (Using forEach)

        final int[] sum = {0}; // workaround for effectively final variable

        list.forEach(n -> sum[0] += n);

        System.out.println("Sum = " + sum[0]);



        //Better Approach (Using Stream API)
        //imp
        List<Integer> list1 = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        int sum1 = list1.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum = " + sum1);

    }
}
