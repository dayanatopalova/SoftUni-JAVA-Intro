import java.util.Scanner;

public class KongGodzilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double price_clothes = Double.parseDouble(scanner.nextLine());

        double clothes = statists * price_clothes;
        double decor = budget * 0.1;

        if(statists > 150){
            clothes = clothes - (clothes * 0.1);
        }

        double money = clothes + decor;

        if(money > budget){
            double needed = money - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", needed);
        }else {
            System.out.println("Action!");
            double left = budget - money;
            System.out.printf("Wingard starts filming with %.2f leva left.", left);
        }
    }
}
