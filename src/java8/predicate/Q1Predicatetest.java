package java8.predicate;
import java.util.function.Predicate;
public class Q1Predicatetest {
    public static void main(String[] args) {

        Predicate<Integer> pr = (num)->
        {
            if(num%2 ==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        };
        System.out.println(pr.test(10));

        // or other typeof use
        Predicate<Integer> pr2 = (num)->
        {
            return num%2==0;
        };
        System.out.println(pr2.test(11));

        // simplest from
        Predicate<Integer> pr3 = (num)->num%2==0;
        System.out.println(pr3.test(12));
    }
}
