package _1_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;


        switch (type) {

            case "Students": {
                switch (day) {

                    case "Friday": {

                        if (groupCount >= 30) {
                            totalPrice += (groupCount * 8.45) - (groupCount * 8.45) * 0.15;
                        } else {
                            totalPrice += groupCount * 8.45;
                        }
                    }
                    break;

                    case "Saturday": {
                        if (groupCount >= 30) {
                            totalPrice += (groupCount * 9.80) - (groupCount * 9.80) * 0.15;
                        } else {
                            totalPrice += groupCount * 9.80;
                        }
                    }
                    break;

                    case "Sunday": {
                        if (groupCount >= 30) {
                            totalPrice += (groupCount * 10.46) - (groupCount * 10.46) * 0.15;
                        } else {
                            totalPrice += groupCount * 10.46;
                        }
                    }
                    break;

                }

            }
            break;

            case "Business": {
                switch (day) {

                    case "Friday": {
                        if (groupCount >= 100) {
                            totalPrice += (groupCount * 10.90) - 10 * 10.90;
                        } else {
                            totalPrice += groupCount * 10.90;
                        }
                    }
                    break;

                    case "Saturday": {
                        if (groupCount >= 100) {
                            totalPrice += (groupCount * 15.60) - 10 * 15.60;
                        } else {
                            totalPrice += groupCount * 15.60;
                        }
                    }
                    break;

                    case "Sunday": {
                        if (groupCount >= 100) {
                            totalPrice += (groupCount * 16) - 10 * 16;
                        } else {
                            totalPrice += groupCount * 16;
                        }
                    }
                    break;

                }

            }
            break;


            case "Regular": {
                switch (day) {
                    case "Friday": {

                        if (groupCount >= 10 && groupCount <= 20) {
                            totalPrice += (groupCount * 15) - (groupCount * 15) * 0.05;
                        } else {
                            totalPrice += groupCount * 15;
                        }
                    }
                    break;

                    case "Saturday": {
                        if (groupCount >= 10 && groupCount <= 20) {
                            totalPrice += (groupCount * 20) - (groupCount * 20) * 0.05;
                        } else {
                            totalPrice += groupCount * 20;
                        }
                    }
                    break;

                    case "Sunday": {
                        if (groupCount >= 10 && groupCount <= 20) {
                            totalPrice += (groupCount * 22.50) - (groupCount * 22.50) * 0.05;
                        } else {
                            totalPrice += groupCount * 22.50;
                        }
                    }
                    break;
                }

            }
            break;

        }

        System.out.printf("Total price: %.2f",totalPrice);

    }
}
