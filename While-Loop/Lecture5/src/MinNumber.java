import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = "";
        int min = Integer.MAX_VALUE;

        while (!"Stop".equals(command)) {

            command = sc.nextLine();

            if (!"Stop".equals(command)) {
                int number = Integer.parseInt(command);

                if (number < min) {
                    min = number;
                }
            }
        }

        System.out.println(min);
    }
}
