package _2_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class _3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = numberOfPeople / capacity;

        if (courses % 2 != 0) {
            courses++;
        } else if (courses == 0) {
            courses++;
        }

        System.out.println(courses);
    }
}
