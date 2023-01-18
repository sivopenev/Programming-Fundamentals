package _2_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class _10_Poke_Mon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int pokes = 0;
        int halfPower = power / 2;


        while (power >= distance) {

            if (power == halfPower) {

                if (exhaustionFactor > 0) {
                    power /= exhaustionFactor;
                }
                if (power < distance) {
                    break;
                }
            }

            power -= distance;
            pokes++;

        }
        System.out.println(power);
        System.out.println(pokes);

    }
}
