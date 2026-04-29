import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int beginning = Integer.parseInt(sc.nextLine());
        int ending = Integer.parseInt(sc.nextLine());
        int magicNumber = Integer.parseInt(sc.nextLine());

        int counter = 0;

        boolean found = false;

        int i = beginning;
        int j = beginning;

        for(i = beginning; i <= ending; i++){
            for(j = beginning; j <= i; j++){
                counter++;

                if(i + j == magicNumber){
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(found){
            System.out.printf("Combination N: %d (%d + %d = %d)", counter, i, j, magicNumber);
        }else{
            System.err.printf("%d combinations - neither equals %d", counter, magicNumber);
        }

    }
}
