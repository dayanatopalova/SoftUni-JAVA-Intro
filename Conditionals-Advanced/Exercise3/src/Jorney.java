import java.util.Scanner;

public class Jorney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        if (budget >= 10.00 && budget <= 5000.00){
            if (budget <= 100){
                if("summer".equals(season)){
                    budget *= 0.3;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Camp - %.2f", budget);
                }else if("winter".equals(season)){
                    budget *= 0.7;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel - %.2f", budget);
                }
            }else if (budget <= 1000) {
                if ("summer".equals(season)) {
                    budget *= 0.4;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f", budget);
                } else if ("winter".equals(season)) {
                    budget *= 0.8;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f", budget);
                }
            }else if (budget > 1000){
                        budget *= 0.9;
                        System.out.println("Somewhere in Europe");
                        System.out.printf("Hotel - %.2f", budget);
                    }
                }
            }
        }


