import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++){
            int value = Integer.parseInt(sc.nextLine());

            if (value > max){
                max = value;
            }

            sum = sum + value;
        }
        int sumWithoutMax = sum - max;

        if (sumWithoutMax == max){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithoutMax);
        }else{
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sumWithoutMax - max));
        }
    }
}
