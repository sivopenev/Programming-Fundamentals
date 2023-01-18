package _2_Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class _5_Concat_Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String firstName = scanner.nextLine();
        String familyName = scanner.nextLine();
        String delimiter = scanner.nextLine();


        System.out.printf("%s%s%s",firstName,delimiter,familyName);


    }
}
