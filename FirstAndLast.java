//Q. Write a program to find the first and last digit of a number and print the sum of first and last digit.
public class FirstAndLast {
    public static void main(String[] args) {
        int num = 6585;
        int last = num % 10;
        int first = num;
        while (first >= 10) {
            first /= 10;
        }
        int sum = first + last;
        System.out.println(first);
        System.out.println(last);
        System.out.println("sum of first and last digit = "+ sum);
    }
}
