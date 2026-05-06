import java.util.Scanner;

public class Trekking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int groups = Integer.parseInt(sc.nextLine());

        int musala = 0;
        int montblanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        int totalPeople = 0;

        for (int i = 0; i < groups; i++) {

            int people = Integer.parseInt(sc.nextLine());
            totalPeople += people;

            if (people <= 5) {
                musala += people;
            } else if (people <= 12) {
                montblanc += people;
            } else if (people <= 25) {
                kilimanjaro += people;
            } else if (people <= 40) {
                k2 += people;
            } else {
                everest += people;
            }
        }

        System.out.printf("%.2f%%%n", musala * 100.0 / totalPeople);
        System.out.printf("%.2f%%%n", montblanc * 100.0 / totalPeople);
        System.out.printf("%.2f%%%n", kilimanjaro * 100.0 / totalPeople);
        System.out.printf("%.2f%%%n", k2 * 100.0 / totalPeople);
        System.out.printf("%.2f%%%n", everest * 100.0 / totalPeople);
    }
}