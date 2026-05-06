import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(sc.nextLine());
        double balance = Double.parseDouble(sc.nextLine());

        String action = "";
        double money = 0.0;
        double endBalance = balance;
        int days = 0;
        int spendingCounter = 0;

        while(endBalance < moneyNeeded && spendingCounter < 5){
            action = sc.nextLine();
            money = Double.parseDouble(sc.nextLine());
            days++;

            if(action.equals("save")){
                endBalance += money;
                spendingCounter = 0;
            }else if(action.equals("spend")){
                endBalance -= money;
                spendingCounter++;
                if(endBalance < 0){
                    endBalance = 0;
                }
            }
        }

        if(spendingCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        }

        if(endBalance >= moneyNeeded){
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
