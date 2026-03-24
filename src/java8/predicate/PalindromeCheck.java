package java8.predicate;

import java.util.function.Predicate;
public class PalindromeCheck {
    public static void main(String[] args) {

        // Predicate to check palindrome
        Predicate<Integer> isPalindrome = (num) -> {
            int original = num;
            int reverse = 0;

            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            return original == reverse;
        };

        // Test number
        int number = 121;

        if (isPalindrome.test(number)) {
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is NOT a Palindrome");
        }
    }
}