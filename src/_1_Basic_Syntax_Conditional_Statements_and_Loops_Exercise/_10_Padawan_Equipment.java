package _1_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class _10_Padawan_Equipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPricePiece = Double.parseDouble(scanner.nextLine());
        double robePricePiece = Double.parseDouble(scanner.nextLine());
        double beltPricePiece = Double.parseDouble(scanner.nextLine());

        int freeBelts = studentsCount / 6;


        double total = (lightsaberPricePiece * (studentsCount + Math.ceil(studentsCount * 0.10)));

        total += (robePricePiece * studentsCount);
        total += (beltPricePiece * (studentsCount - freeBelts));

        if (budget >= total) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(total - budget));
        }
    }
}
