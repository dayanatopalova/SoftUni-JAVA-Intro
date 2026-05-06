package Exercise1;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit_sum = Double.parseDouble(scanner.nextLine());
        int timeframe = Integer.parseInt(scanner.nextLine());
        double dividend = Double.parseDouble(scanner.nextLine());

        double sum = deposit_sum + timeframe * ((deposit_sum * (dividend * 0.01)) / 12);

        System.out.println(sum);
    }
}

