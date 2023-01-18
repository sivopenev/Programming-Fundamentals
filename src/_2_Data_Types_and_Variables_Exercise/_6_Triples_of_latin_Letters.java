package _2_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class _6_Triples_of_latin_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            char firstChar = (char) ('a' + i);

            for (int j = 0; j < n; j++) {
                char secondChar = (char) ('a' + j);

                for (int k = 0; k < n; k++) {
                    char thirdChar = (char) ('a' + k);

                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }
        // Version 2:

        /**
              for (char letter1 = 'a'; letter1 < 'a' + n ; letter1++) {
                  for (char letter2 = 'a'; letter2 < 'a' + n; letter2++) {
                      for (char letter3 = 'a'; letter3 < 'a' + n; letter3++) {
                    System.out.printf("%c%c%c%n", letter1, letter2, letter3);
                }
            }
        }
        **/

    }
}
