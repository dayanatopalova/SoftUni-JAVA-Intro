import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fishingmen = Integer.parseInt(sc.nextLine());
        double price = 0;

        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }

        if (fishingmen >= 4 && fishingmen <= 6) {
            price *= 0.9;
        } else if (fishingmen >= 7 && fishingmen <= 11) {
            price *= 0.85;
        } else if (fishingmen >= 12 && fishingmen <= 18) {
            price *= 0.75;
        }

        if (fishingmen % 2 == 0 && fishingmen >= 4 && fishingmen <= 18 && !"Autumn".equals(season)) {
            price *= 0.95;
        }

        if (budget >= price && budget >= 1 && budget <= 8000) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else if (budget <= price && budget >= 1 && budget <= 8000){
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}