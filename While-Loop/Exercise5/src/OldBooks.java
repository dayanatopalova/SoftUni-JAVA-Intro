import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String searchedBook = sc.nextLine();
        String input = sc.nextLine();
        boolean isFound = false;
        int counter = 0;

        while(!input.equals("No More Books")){

            if (input.equals(searchedBook)) {
                isFound = true;
                break;
            }
            counter++;
            input = sc.nextLine();

        }

        if (isFound){
            System.out.printf("You checked %d books and found it.", counter);
        }else{
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        }

    }
}
