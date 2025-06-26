// Q. Write a program to find the sum of natural numbers from 1 to 25.
// Q. Write a program to find the sum of even numbers from 1 to 25.
// Q. Write a program to find the sum of odd numbers from 1 to 25.
// For example, the output should be:
// The sum of natural number from 1 to 25 is: 325
// The sum of even number from 1 to 25 is: 156
// The sum of odd number from 1 to 25 is: 169

public class sumOfNaturalNumber {

    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        while (num <= 25) {
            if (num % 2 == 0) {
                sumOfEven += num;
            } else if (num % 2 == 1) {
                sumOfOdd += num;
            }
            sum += num;
            num++;

        }
        System.out.println("The sum of natural number from 1 to 25 is: " + sum);
        System.out.println("The sum of even number from 1 to 25 is: " + sumOfEven);
        System.out.println("The sum of even number from 1 to 25 is: " + sumOfOdd);

    }
    // sum of even numbers

}
