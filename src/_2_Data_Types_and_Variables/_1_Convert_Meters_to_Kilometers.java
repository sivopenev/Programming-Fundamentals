package _2_Data_Types_and_Variables;

import java.util.Scanner;

public class _1_Convert_Meters_to_Kilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        short meters = Short.parseShort(scanner.nextLine());

        double kilometres = meters / 1000.0;

        System.out.printf("%.2f",kilometres);
    }
}
