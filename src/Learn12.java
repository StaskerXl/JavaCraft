import java.util.Arrays;

public class Learn12 {
    public static void main(String[] args) {

        int numberList[] = {51, 5345, 23461, 234643, 5431123, 423523, 3422123};
        System.out.println("Our Array: " + Arrays.toString(numberList));
        for (int i = 0; i < numberList.length; i++) {
            System.out.println(i + " Масс " +numberList[i]);
        }
    }
}
