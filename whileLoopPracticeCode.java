// Q. Write a program to reverse a number using while loop.
// For example, if the input is 456, the output should be 654.


public class whileLoopPracticeCode {

    public static void main(String[] args) {
        int num = 456;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse form of number: " + reversed);

    }
}
