import java.util.Scanner;

public class ExamPrep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counterPoorGrades = 0;
        int countProblem = 0;
        int score = 0;
        int grade = 0;
        String lastProblem = "";

        int gradesNumber = Integer.parseInt(sc.nextLine());
        String command = sc.nextLine();

        while (!"Enough".equals(command)) {

            grade = Integer.parseInt(sc.nextLine());
            countProblem++;
            score += grade;
            lastProblem = command;

            if (grade <= 4) {
                counterPoorGrades++;
            }

            if (counterPoorGrades == gradesNumber) {
                System.out.printf("You need a break, %d poor grades.", counterPoorGrades);
                break;
            }

            command = sc.nextLine();
        }

        if (command.equals("Enough")) {
            double average = score * 1.0 / countProblem;
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", countProblem);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
