package _2_Data_Types_and_Variables_More_Exercise;

import java.util.Scanner;

public class _4_Refactoring_Prime_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= n; i++) {

            boolean isPrime = true;

            for (int number = 2; number < i; number++) {

                if (i % number == 0) {
                    isPrime = false;
                    break;
                }

            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }
    }
}
