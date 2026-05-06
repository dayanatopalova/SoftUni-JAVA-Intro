
import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        int gradeLevel = 1;
        int failCount = 0;
        double sum = 0;

        while (gradeLevel <= 12) {

            double grade = Double.parseDouble(sc.nextLine());

            if (grade < 4) {
                failCount++;

                if (failCount == 2) {
                    System.out.printf("%s has been excluded at %d grade", name, gradeLevel);
                    return;
                }

                continue;
            }

            sum += grade;
            gradeLevel++;
        }

        double average = sum / 12;

        System.out.printf("%s graduated. Average grade: %.2f", name, average);
    }
}
