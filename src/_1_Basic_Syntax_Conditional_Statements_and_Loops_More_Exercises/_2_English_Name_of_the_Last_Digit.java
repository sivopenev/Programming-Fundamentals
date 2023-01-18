package _1_Basic_Syntax_Conditional_Statements_and_Loops_More_Exercises;

import java.util.Scanner;

public class _2_English_Name_of_the_Last_Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        int lastNumber = number % 10;

        if (lastNumber == 1){
            System.out.println("one");
        } else if (lastNumber == 2) {
            System.out.println("two");
        } else if (lastNumber == 3) {
            System.out.println("three");
        } else if (lastNumber == 4) {
            System.out.println("four");
        } else if (lastNumber == 5) {
            System.out.println("five");
        } else if (lastNumber == 6) {
            System.out.println("six");
        } else if (lastNumber == 7) {
            System.out.println("seven");
        } else if (lastNumber == 8) {
            System.out.println("eight");
        } else if (lastNumber == 9) {
            System.out.println("nine");
        } else if (lastNumber == 0) {
            System.out.println("zero");
        }

    }
}
