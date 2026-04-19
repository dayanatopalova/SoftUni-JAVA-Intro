package Exercise1;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int folio = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int solution = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double sum = ((paint * 14.50) + ((paint * 14.50) * 0.10)) + ((folio + 2) * 1.50) + solution * 5 + 0.40;
        double final_sum = sum + ((sum * 0.3) * hours);

        System.out.println(final_sum);


    }
}
