package _1_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class _1_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());


        if (age <= 2) {
            System.out.println("baby");
        } else if (age <= 13) {
            System.out.println("child");
        } else if (age <= 19) {
            System.out.println("teenager");
        } else if (age <= 65) {
            System.out.println("adult");
        }else {
            System.out.println("elder");
        }
    }
}
