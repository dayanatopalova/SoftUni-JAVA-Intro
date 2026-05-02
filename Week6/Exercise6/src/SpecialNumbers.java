import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            String str = Integer.toString(i);
            boolean isSpecial = true;

            for (int j = 0; j < str.length(); j++) {
                int digit = str.charAt(j) - '0';

                if (digit == 0 || number % digit != 0) {
                    isSpecial = false;
                    break;
                }
            }

            if (isSpecial) {
                System.out.print(i + " ");
            }
        }
    }
}