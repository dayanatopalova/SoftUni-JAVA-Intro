import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int goal = 10000;
        int sumSteps = 0;

        String input = sc.nextLine();

        while (!input.equals("Going home")) {

            int steps = Integer.parseInt(input);
            sumSteps += steps;

            if (sumSteps >= goal) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", sumSteps - goal);
                return;
            }

            input = sc.nextLine();
        }

        int stepsToHome = Integer.parseInt(sc.nextLine());
        sumSteps += stepsToHome;

        if (sumSteps >= goal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumSteps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - sumSteps);
        }
    }
}