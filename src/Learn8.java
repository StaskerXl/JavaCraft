public class Learn8 {
    public static void main(String[] args) {
        int comit = 0;
        while (comit <= 1){
            System.out.println(comit);
            comit++;
        }

        int counter = 0;
        while (counter <= 1){
            counter++;
            System.out.println("Counter: = " + counter);
        }

        double [] test_ball = {13.4, 100.0, 90.0, 32.3, 5.0};
        int i = 0;
        while (i < test_ball.length) {
            System.out.println("i = " + i);
            System.out.println("test_ball[i] = " + test_ball[i]);
            i++;
        }

    }
}
