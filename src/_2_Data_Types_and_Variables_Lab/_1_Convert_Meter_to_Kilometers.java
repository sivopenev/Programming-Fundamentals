package _2_Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class _1_Convert_Meter_to_Kilometers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double meters = Double.parseDouble(scanner.nextLine());

        double kilometers = meters / 1000;

        System.out.printf("%.2f",kilometers);

    }
}
