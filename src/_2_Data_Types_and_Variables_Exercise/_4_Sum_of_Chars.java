package _2_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class _4_Sum_of_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int total = 0;

        for (int i = 0; i < number; i++) {

            String letter = scanner.nextLine();
            for (int j = 0; j < letter.length(); j++) {

                char charValue = letter.charAt(j);
                total += charValue;
            }
        }

        System.out.printf("The sum equals: %d", total);
    }

}
