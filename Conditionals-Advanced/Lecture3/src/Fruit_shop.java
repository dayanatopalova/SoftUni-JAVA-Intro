import java.util.Scanner;

public class Fruit_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;

        if (!("Monday".equals(day) ||"Tuesday".equals(day) ||"Wednesday".equals(day) ||"Thursday".equals(day) ||"Friday".equals(day) ||"Saturday".equals(day) ||"Sunday".equals(day))){
            System.out.println("error");
            return;
        }
        switch (fruit){
            case "banana":
                if (!"Saturday".equals(day) && !"Sunday".equals(day)){
                    price = quantity * 2.5;
                }else {
                    price = quantity * 2.7;
                }
                break;
            case "orange":
                if (!"Saturday".equals(day) && !"Sunday".equals(day)){
                    price = quantity * 0.85;
                }else {
                    price = quantity * 0.9;
                }
                break;
            case "grapefruit":
                if (!"Saturday".equals(day) && !"Sunday".equals(day)){
                    price = quantity * 1.45;
                }else {
                    price = quantity * 1.6;
                }
                break;
            case "kiwi":
                if (!"Saturday".equals(day) && !"Sunday".equals(day)){
                    price = quantity * 2.7;
                }else {
                    price = quantity * 3;
                }
                break;
            case "apple":
                if (!"Saturday".equals(day) && !"Sunday".equals(day)){
                    price = quantity * 1.2;
                }else {
                    price = quantity * 1.25;
                }
                break;
            case "pineapple":
                if (!"Saturday".equals(day) && !"Sunday".equals(day)){
                    price = quantity * 5.5;
                }else {
                    price = quantity * 5.6;
                }
                break;
            case "grapes":
                if (!"Saturday".equals(day) && !"Sunday".equals(day)){
                    price = quantity * 3.85;
                }else {
                    price = quantity * 4.2;
                }
                break;
            default:
                System.out.println("error");
                return;
        }
        System.out.printf("%.2f",price);
    }
}
