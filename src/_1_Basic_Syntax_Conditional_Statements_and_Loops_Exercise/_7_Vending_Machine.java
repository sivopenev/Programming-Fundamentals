package _1_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class _7_Vending_Machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coins = scanner.nextLine();

        double credit = 0;


        while (!coins.equals("Start")) {
            double input = Double.parseDouble(coins);

            if (coins.equals("0.1") || coins.equals("0.2") || coins.equals("0.5")
                    || coins.equals("1") || coins.equals("2")) {
                credit += input;
            } else {
                System.out.printf("Cannot accept %.2f", input);
            }

            coins = scanner.nextLine();
        }

        String product = scanner.nextLine();

        while (!product.equals("End")) {

            switch (product) {
                case "Nuts": {
                    if (credit >= 2.0) {
                        System.out.println("Purchased Nuts");
                        credit -= 2.0;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                }
                break;

                case "Water": {
                    if (credit >= 0.7) {
                        System.out.println("Purchased Water");
                        credit -= 0.7;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                }
                break;

                case "Crisps": {
                    if (credit >= 1.5) {
                        System.out.println("Purchased Crisps");
                        credit -= 1.5;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                }
                break;

                case "Soda": {
                    if (credit >= 0.8) {
                        System.out.println("Purchased Soda");
                        credit -= 0.8;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                }
                break;

                case "Coke": {
                    if (credit >= 1.0) {
                        System.out.println("Purchased Coke");
                        credit -= 1.0;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                }
                break;

                default:{
                    System.out.println("Invalid product");
                }
            }
            product = scanner.nextLine();
        }


        System.out.printf("Change: %.2f",credit);

    }
}
