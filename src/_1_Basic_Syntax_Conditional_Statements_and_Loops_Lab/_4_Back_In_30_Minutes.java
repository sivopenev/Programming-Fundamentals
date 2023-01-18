package _01_Basic_Syntax_Conditional_Statements_and_Loops_Lab;

import java.util.Scanner;

public class _4_Back_In_30_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 30;

        if (minutes > 59) {
            hours++;
            minutes -= 60;
        }
        if (hours > 23) {
            hours -= 24;
        }


        if (minutes < 10){
            System.out.printf("%d:0%d", hours, minutes);
        }else {
            System.out.printf("%d:%d", hours, minutes);
        }

    }
}
