import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String series_name = scanner.nextLine();
        double episode_time = Double.parseDouble(scanner.nextLine());
        double break_time = Double.parseDouble(scanner.nextLine());

        double lunch = break_time / 8;
        double relax = break_time / 4;

        double total = break_time - lunch - relax;

        if(total >= episode_time){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series_name, Math.ceil(total - episode_time));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series_name, Math.ceil(episode_time - total));
        }
    }
}
