import java.util.Scanner;

public class LeftRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int amount = 2 * number;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 2 * number; i++) {

            int value = Integer.parseInt(sc.nextLine());

            if (i < number) {
                sum1 += value;
            } else {
                sum2 += value;
            }
        }
        if (sum1 == sum2){
            System.out.printf("Yes, sum = %d", sum1);
        }else if (sum1 > sum2){
            System.out.printf("No, diff = %d", sum1 - sum2);
        }else{
            System.out.printf("No, diff = %d", sum2 - sum1);
        }
    }
}
