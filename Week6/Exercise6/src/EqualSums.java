import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = Integer.parseInt(sc.nextLine());
        int number2 = Integer.parseInt(sc.nextLine());

        while(true){
            if(number1 < 100000 || number2 > 300000){
                System.out.println("Wrong input. Allowed range 100000 - 300000. Enter again!");
                number1 = Integer.parseInt(sc.nextLine());
                number2 = Integer.parseInt(sc.nextLine());
            }else if (number1 >= number2){
                System.out.println("Wrong input. The first number has to be smaller than the second. Enter again!");
                number1 = Integer.parseInt(sc.nextLine());
                number2 = Integer.parseInt(sc.nextLine());
            }

            break;
        }

        for(int i = number1; i <= number2; i++){
            String currentNum = "" + i;
            int oddSum = 0;
            int evenSum = 0;

            for(int j = 0; j < currentNum.length(); j++){
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));

                if(j % 2 == 0){
                    evenSum += currentDigit;
                }else{
                    oddSum += currentDigit;
                }
            }
            if(oddSum == evenSum){
                System.out.print(i + " ");
            }
        }
    }
}
