import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int input = 0;
        int sum = 0;

        while(sum < number){

            input = Integer.parseInt(sc.nextLine());
            sum += input;
        }

        System.out.println(sum);
    }
}


