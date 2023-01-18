package _2_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class _7_Water_Overflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int fillingTimes = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int amountFilled = 0;

        for (int i = 0; i < fillingTimes; i++) {

            int waterQuantity = Integer.parseInt(scanner.nextLine());
            amountFilled += waterQuantity;

            if (amountFilled > capacity) {
                System.out.println("Insufficient capacity!");
                amountFilled -= waterQuantity;
            }

        }

        System.out.println(amountFilled);
    }
}
