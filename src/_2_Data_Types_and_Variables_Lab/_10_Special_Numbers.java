package _2_Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class _10_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int currentNumber = i;
            int sum = 0;

            while (currentNumber > 0) {
                sum += (currentNumber % 10);
                currentNumber /= 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

        }
    }
}
