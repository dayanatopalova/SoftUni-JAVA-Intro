import java.util.Scanner;

public class Trade_commissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        double commission = 0;

        if (("Plovdiv".equals(city) || "Sofia".equals(city) || "Varna".equals(city))) {
            if (sells >= 0) {
                switch (city) {
                    case "Plovdiv":
                        if (sells <= 500) {
                            commission = sells * 0.055;
                        } else if (sells <= 1000) {
                            commission = sells * 0.08;
                        } else if (sells <= 10000) {
                            commission = sells * 0.12;
                        } else {
                            commission = sells * 0.145;
                        }
                        break;
                    case "Sofia":
                        if (sells <= 500) {
                            commission = sells * 0.05;
                        } else if (sells <= 1000) {
                            commission = sells * 0.07;
                        } else if (sells <= 10000) {
                            commission = sells * 0.08;
                        } else {
                            commission = sells * 0.12;
                        }
                        break;
                    case "Varna":
                        if (sells <= 500) {
                            commission = sells * 0.045;
                        } else if (sells <= 1000) {
                            commission = sells * 0.075;
                        } else if (sells <= 10000) {
                            commission = sells * 0.1;
                        } else {
                            commission = sells * 0.13;
                        }
                        break;
                }
                System.out.printf("%.2f", commission);
            }else{
                System.out.println("error");
            }
        }else{
            System.out.println("error");
        }
    }
}
