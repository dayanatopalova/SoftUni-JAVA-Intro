import java.util.Scanner;

public class NumbersBackwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number >= 1) {
            for (int i = number; i >= 1; i--) {
                System.out.println(i);
            }
        }
    }
}
