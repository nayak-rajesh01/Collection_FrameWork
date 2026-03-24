package java8.predicate;
import java.util.function.Predicate;
public class CheckEvenOdd {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,6,7,8,9};
        Predicate<Integer> predicate=i->i%2==0;
        for(int num:arr) {
            if(predicate.test(num)){
                System.out.println(num + " is even");
            }
            else {
                System.out.println(num + " Not even");
            }

        }
    }
}
