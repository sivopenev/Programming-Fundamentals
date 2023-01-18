package _3_Arays_Lab;

import java.util.Scanner;

public class _4_Reverse_Array_of_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split(" ");

        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + " ");

        }

    }
}
