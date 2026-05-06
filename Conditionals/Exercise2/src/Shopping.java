import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int gpu = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double gpu_price = gpu * 250;
        double sum = gpu_price + (cpu * (gpu_price * 0.35)) + (ram * (gpu_price * 0.1));

        if (gpu > cpu){
            sum = sum - (sum * 0.15);
        }

        if (budget >= sum){
            System.out.printf("You have %.2f leva left!", budget - sum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", sum - budget);
        }

    }
}
