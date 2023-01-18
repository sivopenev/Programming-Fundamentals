package _2_Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class _9_Centuries_to_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());

        double years = centuries * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",centuries,years,days,hours,minutes);

    }
}
