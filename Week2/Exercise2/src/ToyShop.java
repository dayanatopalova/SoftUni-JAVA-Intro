import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double puzzle_price = 2.60;
        double doll_price = 3.00;
        double teddy_price = 4.10;
        double minion_price = 8.20;
        double truck_price = 2.00;

        double trip_price = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddies = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int all_toys = puzzles + dolls + teddies + minions + trucks;
        double total = puzzle_price * puzzles + doll_price * dolls + teddy_price * teddies + minion_price * minions + truck_price * trucks;

        double rent = total * 0.1;
        total = total - rent;

        if(all_toys >= 50){
            total = total - (total * 0.25) ;
            if(total >= trip_price){
                double left = total - trip_price;
                System.out.printf("Yes! %.2f lv left." , left);
            }else{
                double needed = trip_price - total;
                System.out.printf("Not enough money! %.2f lv needed." , needed);
            }
        }else {
            if(total >= trip_price){
                double left = total - trip_price;
                System.out.printf("Yes! %.2f lv left." , left);
            }else {
                double needed = trip_price - total;
                System.out.printf("Not enough money! %.2f lv needed.", needed);
            }

        }
    }
}
