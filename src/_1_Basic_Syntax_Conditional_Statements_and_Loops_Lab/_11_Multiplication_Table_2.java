package _01_Basic_Syntax_Conditional_Statements_and_Loops_Lab;

import java.util.Scanner;

public class _11_Multiplication_Table_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplicator = Integer.parseInt(scanner.nextLine());
        int beginNum = Integer.parseInt(scanner.nextLine());



        for (int i = beginNum; i <= 10; i++) {
            int result = multiplicator * i;
            System.out.println(multiplicator + " X " + i + " = " + result);
        }
        if (beginNum > 10){
            int result = multiplicator * beginNum;
            System.out.println(multiplicator + " X " + beginNum + " = " + result);
        }
    }
}
