// Q. Write a program to find the power of a number.
// For example, if the input is 5 and the power is 4, the output should be 625.

public class powerOfNum {
    public static void main(String[] args) {
        int num = 5, power = 4, result = 1;

        for (int i = 1; i <= power; i++) {
            if (num == 0) {
                System.out.println("Number Should not be zero");
                break;
            }
            result *= num;
        }
        if (num != 0) {
            System.out.println(result);
        }

    }
}
