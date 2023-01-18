package _1_Basic_Syntax_Conditional_Statements_and_Loops_More_Exercises;

import java.util.Scanner;

public class _3_Gaming_Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());

        double totalSpent = 0;
        boolean outOfMoney = false;

        String game = scanner.nextLine();

        while (!game.equals("Game Time")) {

            switch (game) {


                case "OutFall 4": {
                    if (budget < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought OutFall 4");
                        totalSpent += 39.99;
                        budget -= 39.99;
                    }
                }
                break;

                case "RoverWatch Origins Edition": {
                    if (budget < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought RoverWatch Origins Edition");
                        totalSpent += 39.99;
                        budget -= 39.99;
                    }
                }
                break;

                case "CS: OG": {
                    if (budget < 15.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought CS: OG");
                        totalSpent += 15.99;
                        budget -= 15.99;
                    }
                }
                break;

                case "Zplinter Zell": {
                    if (budget < 19.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought Zplinter Zell");
                        totalSpent += 19.99;
                        budget -= 19.99;
                    }
                }
                break;

                case "Honored 2": {
                    if (budget < 59.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought Honored 2");
                        totalSpent += 59.99;
                        budget -= 59.99;
                    }
                }
                break;

                case "RoverWatch": {
                    if (budget < 29.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought RoverWatch");
                        totalSpent += 29.99;
                        budget -= 29.99;
                    }
                }
                break;
                default: {
                    System.out.println("Not Found");
                }
            }

            if (budget <= 0.0) {
                outOfMoney = true;
                break;
            }

            game = scanner.nextLine();
        }

        if (outOfMoney) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, budget);
        }

    }
}
