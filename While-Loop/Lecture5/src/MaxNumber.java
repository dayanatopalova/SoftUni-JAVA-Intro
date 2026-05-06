import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = "";
        int max = Integer.MIN_VALUE;

        while (!"Stop".equals(command)) {

            command = sc.nextLine();

            if (!"Stop".equals(command)) {
                int number = Integer.parseInt(command);

                if (number > max) {
                    max = number;
                }
            }
        }

        System.out.println(max);
    }
}