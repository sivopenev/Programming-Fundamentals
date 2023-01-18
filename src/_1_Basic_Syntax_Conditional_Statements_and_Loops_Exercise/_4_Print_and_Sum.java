package _1_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class _4_Print_and_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;

        for (int i = start; i <= end; i++) {
            if (i == end){
                System.out.println(i);
            }else {
                System.out.print(i + " ");
            }
            totalSum += i;
        }
        System.out.println("Sum: " + totalSum);
    }
}
