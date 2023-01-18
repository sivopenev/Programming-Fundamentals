package _1_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class _6_Strong_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int initialNumber = number;

        int facSum = 0;

        while (number != 0) {
            int lastDigit = number % 10;

            int faktorielle = 1;

            for (int i = 1; i <= lastDigit; i++) {
                faktorielle *= i;


            }
            facSum += faktorielle;

            number = number / 10;
        }
        if (initialNumber == facSum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
