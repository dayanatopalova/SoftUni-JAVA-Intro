import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int sum = 0;

        int counter = 0;

        for(int i = 0; i <= n; i++){
            x1 = i;
            for(int j = 0; j <= n; j++){
                x2 = j;
                for(int k = 0; k <= n; k++){
                    x3 = k;
                    if(x1 + x2 + x3 == n){
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
