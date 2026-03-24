package java8.BiPredicate;

import java.util.function.BiPredicate;
public class Q1BiPredicateTest {
    public static void main(String[] args)
    {
        BiPredicate<Integer,Integer> biPredicate1 = (num1, num2) ->
        {
            if(num1 > num2){
                return true;
            }
            else{
                return false;
            }
        };
        System.out.println(biPredicate1.test(1,2));
        System.out.println(biPredicate1.test(3,2));

        System.out.println("For integer value check using Lambda Fuunction");
        BiPredicate<Integer, Integer> biPredicate2 = (v1, v2) -> v1.equals(v2);
        System.out.println(biPredicate1.test(1, 2));
        System.out.println(biPredicate2.test(3, 3));


        System.out.println("For String value check using BiPredicate");
        BiPredicate<String, String> biPredicate = (str1, str2) -> str1.equals(str2);
        System.out.println(biPredicate.test("a", "b"));
        System.out.println(biPredicate.test("a", "a"));
    }
}
