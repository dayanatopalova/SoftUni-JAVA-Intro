import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumPrime = 0;
        int sumNonPrime = 0;

        while(true){
            String command = sc.nextLine();

            if(command.equals("stop")){
                break;
            }

            int num = Integer.parseInt(command);

            if(num < 0){
                System.out.println("Negative number.");
                continue;
            }

            boolean isPrime = true;

            if(num < 2){
                isPrime = false;
            }else{
                for (int i = 2; i <= Math.sqrt(num); i++){
                    if(num % i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                sumPrime += num;
            }else{
                sumNonPrime += num;
            }
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNonPrime);
    }
}
