package _2_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class _4_Sum_of_Chars_Ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //брой символи
        int sum = 0; //сума от аски кодове
        for (int i = 0; i < n; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sum += symbol;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
