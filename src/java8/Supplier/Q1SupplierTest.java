package java8.Supplier;
import java.util.Random;
import java.util.function.Supplier;
public class Q1SupplierTest {
    public static void main(String[] args)
    {
        Supplier<String> supplier= ()->"Kumar";
        System.out.println(supplier.get());

        //print a random number

        Supplier<Double> supplier1 = ()->Math.random();
        System.out.println(supplier1.get());

        //Another way to print Random Number
        Supplier<Double> randomSupplier = Math::random;
        System.out.println(randomSupplier.get());

        //create 6 digit random number

        Supplier<Integer> sixDigit = () -> 100000 + new Random().nextInt(900000);

        System.out.println("6 Digit Number: " + sixDigit.get());


    }
}
