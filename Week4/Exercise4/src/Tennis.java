import java.util.Scanner;

public class Tennis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tournaments = Integer.parseInt(sc.nextLine());
        int initial_points = Integer.parseInt(sc.nextLine());
        int tournament_points = 0;
        int counter = 0;

        for (int i = 0; i < tournaments; i++){
            String result = sc.nextLine();

            switch (result){
                case "W":
                    tournament_points += 2000;
                    break;
                case "F":
                    tournament_points += 1200;
                    break;
                case "SF":
                    tournament_points += 720;
                    break;
                }

                if ("W".equals(result)){
                    counter++;
                }

            }

        int all_points = initial_points + tournament_points;

        int average_points = tournament_points / tournaments;

        double percentage = ((double) counter/ tournaments) * 100;

        System.out.printf("Final points: %d\n", all_points);
        System.out.printf("Average points: %d\n", average_points);
        System.out.printf("%.2f%%", percentage);

    }
}
