import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int floors = Integer.parseInt(sc.nextLine());
        int apartmentsPerFloor = Integer.parseInt(sc.nextLine());
        String prefix = "";

        for (int i = floors; i >= 1; i--){

            for(int j = 0; j < apartmentsPerFloor; j++) {

                if (i == floors) {
                    prefix = "L";
                    System.out.printf("%s%d%d\n", prefix, i, j);
                } else if (i % 2 != 0) {
                    prefix = "A";
                    System.out.printf("%s%d%d\n", prefix, i, j);
                } else {
                    prefix = "O";
                    System.out.printf("%s%d%d\n", prefix, i, j);
                }
            }



        }


    }
}
