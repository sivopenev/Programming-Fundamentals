package _3_Arays_Lab;

import java.util.Scanner;

public class _1_Day_of_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        if (n >= 1 && n <= 7) {
            System.out.println(day[n - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
