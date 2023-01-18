package _2_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class _8_Beer_Kegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int iterations = Integer.parseInt(scanner.nextLine());

        String biggestKeg = "";
        double currentRadius = 0;
        for (int i = 0; i < iterations; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            radius = Math.PI * radius * radius * height;

            if (radius > currentRadius){
                currentRadius = radius;
                biggestKeg = model;
            }
        }

        System.out.println(biggestKeg);
    }

}
