import java.util.Scanner;

public class Time_Sports {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time_competitor1 = Integer.parseInt(scanner.nextLine());
        int time_competitor2 = Integer.parseInt(scanner.nextLine());
        int time_competitor3 = Integer.parseInt(scanner.nextLine());

        int sum_time = time_competitor1 +  time_competitor2 + time_competitor3;

        int minutes = sum_time / 60;
        int seconds = sum_time % 60;

        System.out.printf("%d:%02d", minutes, seconds);
    }
}
