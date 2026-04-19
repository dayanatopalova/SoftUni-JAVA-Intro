import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;

        if (n >= 1 && n <= 1000) {
            int value = 0;
            for (int i = 1; i <= n; i++) {
                value = Integer.parseInt(sc.nextLine());

                if (value >= 1 && value < 200) {
                    counter1++;
                } else if (value >= 200 && value <= 399) {
                    counter2++;
                } else if (value >= 400 && value <= 599) {
                    counter3++;
                } else if (value >= 600 && value <= 799) {
                    counter4++;
                } else if (value >= 800 && value <= 1000) {
                    counter5++;
                }
            }
        }
        p1 = (double) counter1 * 100 / n;
        p2 = (double) counter2 * 100 / n;
        p3 = (double) counter3 * 100 / n;
        p4 = (double) counter4 * 100 / n;
        p5 = (double) counter5 * 100 / n;

        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
        System.out.printf("%.2f%%\n", p4);
        System.out.printf("%.2f%%\n", p5);

    }

}
