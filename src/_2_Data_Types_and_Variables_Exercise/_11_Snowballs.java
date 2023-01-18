package _2_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class _11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // number of snowballs
        int n = Integer.parseInt(scanner.nextLine());

        double highestSnowballValue = 0;


        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;

        for (int i = 0; i < n; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(1.0 * snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > highestSnowballValue) {
                highestSnowballValue = snowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", bestSnowballSnow, bestSnowballTime, highestSnowballValue, bestSnowballQuality);

    }
}
