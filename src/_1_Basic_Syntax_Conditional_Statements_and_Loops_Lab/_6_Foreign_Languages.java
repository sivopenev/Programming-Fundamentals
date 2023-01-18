package _01_Basic_Syntax_Conditional_Statements_and_Loops_Lab;

import java.util.Scanner;

public class _6_Foreign_Languages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        switch (country){

            case "England":

            case "USA": {
                System.out.println("English");
            }
            break;

            case "Spain":

            case "Argentina":

            case "Mexico": {
                System.out.println("Spanish");
            }
            break;
            default:{
                System.out.println("unknown");
            }
        }



    }
}
