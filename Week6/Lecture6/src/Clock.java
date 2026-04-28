public class Clock {
    public static void main(String[] args) {

        int hours = 0;
        int minutes = 0;

        for (int i = 0; i <= 24; i++){
            hours = i;
            for(int j = 0; j <= 60; j++){
                minutes = j;

                if(j <= 59 && i <= 23){
                System.out.printf("\n%d:%d", hours, minutes);
                }
            }
        }
    }
}
