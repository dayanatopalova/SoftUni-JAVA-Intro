import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = 0; i < amount; i++){
            int number = Integer.parseInt(sc.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}
