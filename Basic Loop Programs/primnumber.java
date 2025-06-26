// Q. Write a program to print all the prime numbers from 0 to 80.
// For example, the output should be 2 3 5 7 11 ... 79.

public class primnumber {

    public static void main(String[] args) {
        int upto = 80;
        for (int i = 0; i < upto; i++) {
            boolean prime = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
    }
}
