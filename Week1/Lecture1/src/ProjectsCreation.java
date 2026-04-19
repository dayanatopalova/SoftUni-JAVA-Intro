package Lecture1;

import java.util.Scanner;

public class Projects_Creation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int time_needed = projects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name,time_needed,projects);

    }
}
