import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double points = Integer.parseInt(scanner.nextLine());
        double bonus_points = 0;

        if(points <= 100){
            bonus_points = 5;
        }else if(points <= 1000){
            bonus_points = points * 0.2;
        }else {
            bonus_points = points * 0.1;
        }

        if (points % 2 == 0){
            bonus_points += 1;
        }else if(points % 5 == 0){
            bonus_points += 2;
        }

        System.out.println(bonus_points);
        System.out.println(bonus_points + points);
    }
}
