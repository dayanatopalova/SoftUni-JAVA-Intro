import java.util.Scanner;

public class Working_hours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (time >= 10 && time <= 18 && !"Sunday".equals(day)){
            System.out.println("open");
        }else{
            System.out.println("closed");
        }
    }
}
