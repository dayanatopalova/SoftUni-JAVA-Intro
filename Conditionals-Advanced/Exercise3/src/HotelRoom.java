import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double priceA = 0.0;
        double priceC = 0.0;

        if (number >= 0 && number <= 200) {
            switch (month) {
                case "May":
                case "October":
                    priceA = number * 65;
                    priceC = number * 50;

                    if (number > 7 && number < 14) {
                        priceC = priceC - (priceC * 0.05);
                    } else if (number > 14) {
                        priceA = priceA - (priceA * 0.1);
                        priceC = priceC - (priceC * 0.3);
                    }
                    System.out.printf("Apartment: %.2f lv.", priceA);
                    System.out.printf("\nStudio: %.2f lv.", priceC);
                    break;

                case "June":
                case "September":
                    priceC = number * 75.2;
                    priceA = number * 68.7;
                    if (number > 14) {
                        priceA = priceA - (priceA * 0.1);
                        priceC = priceC - (priceC * 0.2);
                    }
                    System.out.printf("Apartment: %.2f lv.", priceA);
                    System.out.printf("\nStudio: %.2f lv.", priceC);
                    break;

                case "July":
                case "August":
                    priceC = number * 76;
                    priceA = number * 77;
                    if (number > 14) {
                        priceA = priceA - (priceA * 0.1);
                    }
                    System.out.printf("Apartment: %.2f lv.", priceA);
                    System.out.printf("\nStudio: %.2f lv.", priceC);
                    break;
            }

        }
    }
}
