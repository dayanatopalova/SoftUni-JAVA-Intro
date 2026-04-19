import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int years = Integer.parseInt(sc.nextLine());
        int lev = 0;
        double money = 0.0;
        double savings_birthdays = 0.0;
        int counter= 0;

        double washing_machine_price = Double.parseDouble(sc.nextLine());

        double money_toys = Double.parseDouble(sc.nextLine());

        if (years >= 1 && years <= 77
                && washing_machine_price >= 1.0
                && washing_machine_price <= 10000
                && money_toys >= 0
                && money_toys <=40) {

            for (int i = 1; i <= years; i++) {
                if (i % 2 == 0) {
                    lev++;
                    money += 10.0;
                    savings_birthdays += money;
                } else {
                    counter++;
                }
            }

            double savings = savings_birthdays + (counter * money_toys) - lev;

            if (savings >= washing_machine_price) {
                System.out.printf("Yes! %.2f", savings - washing_machine_price);
            } else {
                System.out.printf("No! %.2f", washing_machine_price - savings);
            }
        }
    }
}
