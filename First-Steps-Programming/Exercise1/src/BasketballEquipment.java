package Exercise1;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price =Integer.parseInt(scanner.nextLine());

        double shoes = price - (price * 0.4);
        double clothes = shoes - (shoes * 0.2);
        double ball = clothes / 4;
        double accessories = ball / 5;

        double final_price = price + shoes + clothes + ball + accessories;

        System.out.println(final_price);

    }
}
