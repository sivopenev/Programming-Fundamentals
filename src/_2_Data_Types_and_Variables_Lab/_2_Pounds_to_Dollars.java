package _2_Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class _2_Pounds_to_Dollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pounds = Double.parseDouble(scanner.nextLine());

        double dollars = 1.36;

        System.out.printf("%.3f",dollars * pounds);
    }
}
