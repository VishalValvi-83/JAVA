// Q. Write a program to print all the even numbers from 1 to 100.
// For example, the output should be 2 4 6 8 ... 100.

public class evenNumber {

    public static void main(String[] args) {
        int num = 1;
        while (num <= 100) {
            if (num % 2 == 0)
                System.out.print(num + " ");
            num++;
        }
    }
}
