package _2_Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class _4_Town_Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());


        System.out.printf("Town %s has population of %d and area %d square km.",town,population,area);


    }
}
