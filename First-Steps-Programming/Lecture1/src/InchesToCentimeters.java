package Lecture1;

import java.util.Scanner;

public class Inches_to_Centimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        System.out.println(number * 2.54);


    }
}
