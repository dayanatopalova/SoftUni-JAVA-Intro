import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = "";

        while(!"Stop".equals(input)){

            System.out.println(input);
            input = sc.nextLine();

        }
    }
}
