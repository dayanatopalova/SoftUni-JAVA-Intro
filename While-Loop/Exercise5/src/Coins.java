import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double change = Double.parseDouble(sc.nextLine());

        int changeInSt = (int) (change * 100);

        int count = 0;

        while (changeInSt > 0) {
            if (changeInSt >= 200) {
                changeInSt -= 200;
                count++;
            } else if (changeInSt >= 100) {
                changeInSt -= 100;
                count++;
            } else if (changeInSt >= 50) {
                changeInSt -= 50;
                count++;
            } else if (changeInSt >= 20) {
                changeInSt -= 20;
                count++;
            } else if (changeInSt >= 10) {
                changeInSt -= 10;
                count++;
            } else if (changeInSt >= 5) {
                changeInSt -= 5;
                count++;
            } else if (changeInSt >= 2) {
                changeInSt -= 2;
                count++;
            } else if (changeInSt >= 1) {
                changeInSt -= 1;
                count++;
            }
        }

        System.out.println(count);
    }
}
