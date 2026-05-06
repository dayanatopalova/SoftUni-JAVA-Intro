import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double actorPoints = Double.parseDouble(scanner.nextLine());
        int countJury = Integer.parseInt(scanner.nextLine());

        for (int jury = 1; jury <= countJury; jury++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());

            double givenPoints = (juryName.length() * juryPoints) / 2;

            actorPoints += givenPoints;

            if (actorPoints > 1250.50) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, actorPoints);
                break;
            }
        }

        if (actorPoints <= 1250.50) {
            double needPoints = 1250.50 - actorPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actorName, needPoints);
        }

    }
}
