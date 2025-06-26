//Factorial of number

public class factorialOfNum {
    public static void main(String[] args) {
        int num = 4;
        int factorail = 1;

        // Factorail of number using for loop

        for (int i = 1; i <= num; i++) {
            factorail *= i;
        }

        System.out.println(factorail);

        // Factorail of number using while loop
        int number = 5;
        int i = 1;
        while (i <= number) {
            factorail *= i;
            i++;
        }

        // Factorail of number using do-while loop
        System.out.println(factorail);
        int j = 1;
        do {
            factorail *= j;
            j++;
        } while (i <= number);
        System.out.println(factorail);

    }

}
