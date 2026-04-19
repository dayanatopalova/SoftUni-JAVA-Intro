import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command;
        double total = 0;

        while (sc.hasNext()) {
            command = sc.next();

            if (command.equals("NoMoreMoney")) {
                break;
            }

            double amount = Double.parseDouble(command);

            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            total += amount;
            System.out.printf("Increase: %.2f%n", amount);
        }

        System.out.printf("Total: %.2f", total);
    }
}