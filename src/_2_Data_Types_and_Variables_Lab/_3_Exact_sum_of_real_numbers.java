package _2_Data_Types_and_Variables_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class _3_Exact_sum_of_real_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        BigDecimal total = new BigDecimal(0);
        for (int i = 0; i < number; i++) {

            BigDecimal digit = new BigDecimal(scanner.nextLine());

           total = total.add(digit);

        }

        System.out.println(total);
    }
}
