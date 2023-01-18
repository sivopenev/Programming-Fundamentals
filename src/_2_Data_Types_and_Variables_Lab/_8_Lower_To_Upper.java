package _2_Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class _8_Lower_To_Upper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String isLowerCase = scanner.nextLine();

        for (int i = 0; i < isLowerCase.length(); i++) {

            char character = isLowerCase.charAt(i);


            if (Character.isLowerCase(character)) {
                System.out.println("lower-case");
            } else {
                System.out.println("upper-case");
            }

        }


    }
}
