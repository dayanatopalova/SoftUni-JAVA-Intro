import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operand = scanner.nextLine();

        int sum = number1 + number2;
        int mult = number1 * number2;

        switch (operand) {
            case "+":
                if (sum % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", number1, number2, sum);
                }else {
                    System.out.printf("%d + %d = %d - odd", number1, number2, sum);

                }
                break;
            case "-":
                    int dif = number1 - number2;
                    if (dif % 2 == 0) {
                        System.out.printf("%d - %d = %d - even", number1, number2, dif);
                    }else{
                        System.out.printf("%d - %d = %d - odd", number1, number2, dif);
                }
                break;
            case "*":
                if (mult % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", number1, number2, mult);
                }else {
                    System.out.printf("%d * %d = %d - odd", number1, number2, mult);

                }
                break;
            case "/":
                if (number2 != 0){
                    double div = (double) number1 / number2;
                    System.out.printf("%d / %d = %.2f", number1, number2, div);
                }else{
                    System.out.printf("Cannot divide %d by zero", number1);
                }
                break;
            case "%":
                if (number2 != 0){
                    int mod = number1 % number2;
                    System.out.printf("%d %% %d = %d", number1, number2, mod);
                }else{
                    System.out.printf("Cannot divide %d by zero", number1);
                }
                break;

        }
    }
}
