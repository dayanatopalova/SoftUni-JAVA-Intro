package Lecture1;

import java.util.Scanner;

public class Yard_Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double surface = Double.parseDouble(scanner.nextLine());

        double sum = surface * 7.61;
        double discount = sum * 0.18;
        double final_sum = sum - discount;

        System.out.printf("The final price is: %f lv.\n", final_sum);
        System.out.printf("The discount is: %f lv.\n", discount);
    }
}
