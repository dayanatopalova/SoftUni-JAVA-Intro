import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wr_seconds = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time_seconds_meter = Double.parseDouble(scanner.nextLine());

        double ivan_time = (distance * time_seconds_meter) + ((Math.floor(distance / 15)) * 12.5);

        if (ivan_time < wr_seconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivan_time);
        }else {
            double left = ivan_time - wr_seconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", left);
        }
    }
}
