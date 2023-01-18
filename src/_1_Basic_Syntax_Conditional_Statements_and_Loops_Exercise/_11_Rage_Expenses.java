package _1_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class _11_Rage_Expenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lost_Games_Count = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());


        double total = 0;

        int headsetTrashTimes = lost_Games_Count / 2;
        int mouseTrashTimes = lost_Games_Count / 3;
        int keyboardTrashTimes = lost_Games_Count / 6;
        int displayTrashTimes = lost_Games_Count / 12;

        total += 1.0 * headsetTrashTimes * headsetPrice + mouseTrashTimes * mousePrice
                + keyboardTrashTimes * keyboardPrice + displayTrashTimes * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", total);

    }
}
