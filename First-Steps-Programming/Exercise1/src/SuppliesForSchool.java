package Exercise1;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens_package =  Integer.parseInt(scanner.nextLine());
        int highlighters_package = Integer.parseInt(scanner.nextLine());
        int liters_solution = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double sum = (pens_package * 5.80) + (highlighters_package * 7.20) + (liters_solution * 1.20);
        double money_needed = sum - (sum * (discount * 0.01));

        System.out.println(money_needed);
    }
}
