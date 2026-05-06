import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());

        int volumeRoom = width * length * height;
        int volumeBoxes = 0;

        String input = sc.nextLine();

        while(!"Done".equals(input)){

            int boxesNumber = Integer.parseInt(input);
            volumeBoxes += boxesNumber;

            if(volumeBoxes > volumeRoom){
                System.out.printf("No more free space! You need %d Cubic meters more.", volumeBoxes - volumeRoom);
                return;
            }
            input = sc.nextLine();
        }
        System.out.printf("%d Cubic meters left.", volumeRoom - volumeBoxes);
    }
}
