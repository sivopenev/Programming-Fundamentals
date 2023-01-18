package _2_Data_Types_and_Variables_More_Exercise;

import java.util.Scanner;

public class _3_Floating_Equality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double difference = Math.abs(a-b);

        double eps = 0.000001;

        if (difference > eps){
            System.out.println("False");
        }else {
            System.out.println("True");
        }


    }
}
