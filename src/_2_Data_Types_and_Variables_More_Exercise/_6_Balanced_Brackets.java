package _2_Data_Types_and_Variables_More_Exercise;

import java.util.Scanner;

public class _6_Balanced_Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        int openingBracket = 0;
        int closingBracket = 0;
        boolean isBalanced = true;

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();


            if (input.equals("(")) {
                openingBracket++;
                if (openingBracket == 2) {
                    isBalanced = false;
                    break;
                }
            } else if (input.equals(")")) {
                closingBracket++;

                if (openingBracket == 0) {
                    isBalanced = false;
                    break;
                }

                if (openingBracket == closingBracket) {
                    openingBracket = 0;
                    closingBracket = 0;
                }
            }

        }


        if (openingBracket == 1 || closingBracket == 1) {

            System.out.println("UNBALANCED");

        } else if (isBalanced) {

            System.out.println("BALANCED");

        } else {

            System.out.println("UNBALANCED");
        }
    }
}
