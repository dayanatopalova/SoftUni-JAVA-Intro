import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++){
            int value = Integer.parseInt(sc.nextLine());

            if (i % 2 == 0){
                sum1 += value;
            }else{
                sum2 += value;
            }
        }
        if (sum1 == sum2){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum1);
        }else if (sum1 > sum2){
            System.out.println("No");
            System.out.printf("Diff = %d", sum1 - (sum2));
        }else{
            System.out.println("No");
            System.out.printf("Diff = %d", sum2 - (sum1));
        }

    }
}
