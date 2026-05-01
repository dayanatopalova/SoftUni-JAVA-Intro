import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int current = 1;
        boolean isBigger = false;

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){

                if(current > n){
                    isBigger = true;
                    break;
                }
                System.out.print(current + " ");
                current++;
            }
            if(isBigger){
                break;
            }
            System.out.println();

            for (int k = 1; k * (k + 1) / 2 <= n; k++) {
                for (int p = 1; p <= i; p++) {
                    System.out.print(current + " ");
                    current++;
                }
                System.out.println();
            }
        }
    }
}
