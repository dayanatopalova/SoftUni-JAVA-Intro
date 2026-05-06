import java.util.Scanner;

public class FormsArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String form = scanner.nextLine();

        if (form.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());

            double area = a * a;
            System.out.println(area);
        }else if (form.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());

            double area = a * b;
            System.out.println(area);
        }else if(form.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());

            double area = Math.PI * r * r;
            System.out.println(area);
        }else if(form.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            double area = (a * h) / 2;
            System.out.println(area);
        }
    }
}
