import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = scanner.nextInt();
        scanner.nextLine();
        String time = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (degrees >= 10 && degrees <= 42) {
            if (degrees <= 18) {
                if ("Morning".equals(time)) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if ("Afternoon".equals(time) || "Evening".equals(time)) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
            } else if (degrees <= 24) {
                if ("Morning".equals(time) || "Evening".equals(time)) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if ("Afternoon".equals(time)) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
            } else if (degrees <= 42) {
                if ("Morning".equals(time)) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if ("Afternoon".equals(time)) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }else if ("Evening".equals(time)){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
            }

            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
        }
    }
}
