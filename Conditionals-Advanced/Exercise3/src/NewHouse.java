import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String flowers = sc.nextLine();
        int amount = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());
        double price = 0;

        if ("Roses".equals(flowers)) {
            price = amount * 5;

            if(amount > 80){
                price = price - (price * 0.1);
            }

        } else if ("Dahlias".equals(flowers)) {
            price = amount * 3.8;

            if(amount > 90){
                price = price - (price * 0.15);
            }

        } else if ("Tulips".equals(flowers)) {
            price = amount * 2.8;

            if(amount > 80){
                price = price - (price * 0.15);
            }

        }else if ("Narcissus".equals(flowers)){
            price = amount * 3;

            if(amount < 120){
                price = price + (price * 0.15);
            }

        }else if ("Gladiolus".equals(flowers)){
            price = amount * 2.5;

            if(amount < 80){
                price = price + (price * 0.2);
            }
        }

        if (budget >= price){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amount, flowers, budget - price);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}
