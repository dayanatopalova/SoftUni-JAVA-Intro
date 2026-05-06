import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        double sumP = row * column;
        double sumN = row * column;
        double sumD = row * column;

        if ("Premiere".equals(type)){
           sumP *= 12;
            System.out.printf("%.2f", sumP);
            System.out.print("\nleva");
        } else if ("Normal".equals(type)){
            sumN *= 7.5;
            System.out.printf("%.2f", sumN);
            System.out.print("\nleva");
        }else if("Discount".equals(type)){
            sumD *= 5;
            System.out.printf("%.2f leva", sumD);
        }
    }
}
