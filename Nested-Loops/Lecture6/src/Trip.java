import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        double budget = Double.parseDouble(sc.nextLine());
        double sum = 0.0;
        double deposit = 0.0;

        while (!command.equals("End")){
            while(sum < budget){
                deposit = Double.parseDouble(sc.nextLine());
                sum += deposit;

                if(sum >= budget){
                    System.out.printf("Going to %s!\n", command);
                    break;
                }
            }
            sum = 0;
            command = sc.nextLine();
            if (!command.equals("End")) {
                budget = Double.parseDouble(sc.nextLine());
            }
        }
    }
}
