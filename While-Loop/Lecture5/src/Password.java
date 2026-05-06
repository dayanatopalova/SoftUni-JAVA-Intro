import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String password = sc.nextLine();

        String input_password = sc.nextLine();

        while (!input_password.equals(password)){
            input_password = sc.nextLine();
        }

        System.out.printf("Welcome %s!", name);
    }
}
