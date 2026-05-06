import java.util.Scanner;

public class TimeExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int arriveH = Integer.parseInt(scanner.nextLine());
        int arriveM = Integer.parseInt(scanner.nextLine());

        int sum1 = hour * 60 + minutes;
        int sum2 = arriveH * 60 + arriveM;

        int diff = sum1 - sum2;
        int newH = diff / 60;
        int newM = diff % 60;

        if (diff <= 30 && diff > 0) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", diff);
        }else if (diff > 30 && diff <= 59) {
            System.out.println("Early");
            System.out.printf("%d minutes before the start", diff);
        } else if (diff > 59) {
            System.out.println("Early");
            System.out.printf("%d:%02d hours before the start", newH, newM);
        } else if (diff == 0) {
            System.out.println("On time");
        } else if (diff >= -59) {
            System.out.println("Late");
            System.out.printf("%d minutes after the start", Math.abs(diff));
        } else {
            System.out.println("Late");
            System.out.printf("%d:%02d hours after the start", Math.abs(newH), Math.abs(newM));

        }
    }
}
