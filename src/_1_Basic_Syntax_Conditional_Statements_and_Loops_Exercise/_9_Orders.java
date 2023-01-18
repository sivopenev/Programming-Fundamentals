package _1_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class _9_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int orders = Integer.parseInt(scanner.nextLine());

        double total = 0;

        for (int i = 0; i < orders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double currentCoffeePrice = ((days * capsulesCount) * pricePerCapsule);

            System.out.printf("The price for the coffee is: $%.2f%n", currentCoffeePrice);
            total += currentCoffeePrice;
        }
        System.out.printf("Total: $%.2f",total);
    }
}
