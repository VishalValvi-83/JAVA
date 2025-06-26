// Q. Write a program to print the table of a number.
// For example, if the input is 5, the output should be: // 5 10 15 20 ... 50.

public class tableOfNum {
    public static void main(String[] args) {
        int num = 5;
        int table;
        for (int i = 1; i <= 10; i++) {
            table = i * num;
            System.out.println(table);

        }
    }
}
