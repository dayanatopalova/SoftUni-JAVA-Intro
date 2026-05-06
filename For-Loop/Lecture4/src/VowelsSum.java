import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++){
            char letter = input.charAt(i);
            if ('a' == letter){
                sum += 1;
            }else if('e' == letter){
                sum += 2;
            }else if('i' == letter) {
                sum += 3;
            }else if('o' == letter) {
                sum += 4;
            }else if('u' == letter) {
                sum += 5;
            }
        }
        System.out.println(sum);
    }
}
