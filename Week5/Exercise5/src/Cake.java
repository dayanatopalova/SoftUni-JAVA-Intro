import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());

        int piecesTotal = length * width;

        String piecesTaken = sc.nextLine();
        int sumPieces = 0;

        while(!"STOP".equals(piecesTaken)){

            int pieces = Integer.parseInt(piecesTaken);
            sumPieces += pieces;

            if(sumPieces > piecesTotal){
                System.out.printf("No more cake left! You need %d pieces more.", sumPieces - piecesTotal);
                return;
            }

            piecesTaken = sc.nextLine();
        }

        System.out.printf("%d pieces are left.", piecesTotal - sumPieces);

    }
}
