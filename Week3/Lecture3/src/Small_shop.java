import java.util.Scanner;

public class Small_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch(product){
            case "coffee":
                if ("Sofia".equals(city)){
                    price = amount * 0.5;
                }else if("Plovdiv".equals(city)){
                    price = amount * 0.4;
                }else if("Varna".equals(city)){
                    price = amount * 0.45;
                }break;
            case "water":
                if ("Sofia".equals(city)){
                    price = amount * 0.8;
                }else if("Plovdiv".equals(city)){
                    price = amount * 0.7;
                }else if("Varna".equals(city)){
                    price = amount * 0.7;
                }break;
            case "sweets":
                if ("Sofia".equals(city)){
                    price = amount * 1.45;
                }else if("Plovdiv".equals(city)){
                    price = amount * 1.30;
                }else if("Varna".equals(city)){
                    price = amount * 1.35;
                }break;
            case "peanuts":
                if ("Sofia".equals(city)){
                    price = amount * 1.6;
                }else if("Plovdiv".equals(city)){
                    price = amount * 1.5;
                }else if("Varna".equals(city)){
                    price = amount * 1.55;
                }break;
            case "beer":
                if ("Sofia".equals(city)){
                    price = amount * 1.2;
                }else if("Plovdiv".equals(city)){
                    price = amount * 1.15;
                }else if("Varna".equals(city)){
                    price = amount * 1.1;
                }break;
        }
        System.out.println(price);
    }
}
