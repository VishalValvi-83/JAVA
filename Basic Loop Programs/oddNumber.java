// Q. Write a program to print all the odd numbers from 1 to 100.
// For example, the output should be 1 3 5 7 ... 99.


public class oddNumber {
    public static void main(String[] args) {
        int num = 1;
        while (num<=100) {
            if(num%2== 1) System.out.print(num + " ");
            num++;
        }
    }
}
