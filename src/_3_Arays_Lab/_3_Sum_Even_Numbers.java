package _3_Arays_Lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _3_Sum_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();


        int sum = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
