package _1_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class _5_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String username = scanner.nextLine();
        String password = scanner.nextLine();

        int wrongPassCount = 0;
        boolean isBlocked = false;

        String reversedPassword = new StringBuffer(password).reverse().toString();
        while (!reversedPassword.equals(username)) {

            wrongPassCount++;

            if (wrongPassCount == 4) {
                isBlocked = true;
                break;
            }else {
                System.out.println("Incorrect password. Try again.");
            }
            password = scanner.nextLine();
            reversedPassword = new StringBuffer(password).reverse().toString();
        }
        if (isBlocked) {
            System.out.printf("User %s blocked!", username);
        } else {
            System.out.printf("User %s logged in.", username);
        }
    }
}
