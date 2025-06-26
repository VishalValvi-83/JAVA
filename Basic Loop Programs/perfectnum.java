// Q. Write a program to check whether a number is perfect or not.
// A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself.
// For example, 6 is a perfect number because its divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.

public class perfectnum {

    public static void main(String[] args) {
        int num = 6;
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum *= i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is Perfect Number");
        } else {
            System.out.println(num + " is NOT Perfect Number");

        }
    }
}
