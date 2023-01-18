package _2_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class _9_Spice_Must_Flow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int startingYield = Integer.parseInt(scanner.nextLine());

        int totalSpices = 0;
        int expectedYield = startingYield;
        int days = 0;

        while (expectedYield >= 100) {
            days++;

            totalSpices += expectedYield;
            expectedYield -= 10;
            totalSpices -= 26;

        }
        totalSpices -= 26;

        System.out.printf("%d%n", days);
        if (totalSpices < 0){
            System.out.println(0);
        }else {
            System.out.printf("%d", totalSpices);
        }
    }

}
