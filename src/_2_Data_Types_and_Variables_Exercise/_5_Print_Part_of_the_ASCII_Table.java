package _2_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class _5_Print_Part_of_the_ASCII_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());


        for (int i = start; i <= end; i++) {

            if (i < end) {
                System.out.print((char) i + " ");
            } else {
                System.out.print((char) i);
            }
        }


    }
}
