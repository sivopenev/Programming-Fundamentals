package _2_Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class _6_Chars_to_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String char1 = scanner.nextLine();
        String char2 = scanner.nextLine();
        String char3 = scanner.nextLine();

        String word = "";

        word += char1;
        word += char2;
        word += char3;

        System.out.println(word);
        // System.out.println(char1+char2+char3);


    }
}
