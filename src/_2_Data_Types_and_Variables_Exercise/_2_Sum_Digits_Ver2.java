package _2_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class _2_Sum_Digits_Ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < number.length(); i++) {

            char num = number.charAt(i);
            int currentNumber = Integer.parseInt(String.valueOf(num));
            sum += currentNumber;
        }
        System.out.println(sum);
    }
}
