package _2_Data_Types_and_Variables_More_Exercise;

import java.util.Scanner;

public class _5_Decrypting_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());

        String decryptedMessage = "";

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {

            char letter =  scanner.nextLine().charAt(0);

            decryptedMessage += (char) (letter + key);
        }


        System.out.println(decryptedMessage);
    }
}
