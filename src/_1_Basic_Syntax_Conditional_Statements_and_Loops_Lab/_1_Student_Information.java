package _01_Basic_Syntax_Conditional_Statements_and_Loops_Lab;

import java.util.Scanner;

public class _1_Student_Information {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());


        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,grade);



    }
}
