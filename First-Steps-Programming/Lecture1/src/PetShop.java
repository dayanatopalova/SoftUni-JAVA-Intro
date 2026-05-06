package Lecture1;

import java.util.Scanner;

public class Pet_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dog_food_number = Integer.parseInt(scanner.nextLine());
        double dog_food_sum = dog_food_number * 2.50;
        int cat_food_number = Integer.parseInt(scanner.nextLine());
        double cat_food_sum = cat_food_number * 4;

        double whole_sum = dog_food_sum + cat_food_sum;

        System.out.println(whole_sum);
    }
}
