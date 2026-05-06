import java.util.Scanner;

public class TimeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutes_sum = (hours * 60) + minutes + 15;
        int new_hours = minutes_sum / 60;
        int new_minutes = minutes_sum % 60;

        if (new_hours > 23){
            System.out.printf("0:%02d",new_minutes);
        }else{
            System.out.printf("%d:%02d", new_hours, new_minutes);
        }
    }
}
