import java.io.IOException;
import java.util.Scanner;

public class Learn10 {
    public static void main(String[] args) throws IOException {

        int bob = 35;

        do {
            System.out.println(bob);
            bob++;
        }while (bob <= 35);



        System.out.println(bob + "\n");

        while (bob <= 35){
            System.out.println(bob + " while");
        }
        System.out.println(bob + " no while");

        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.println("Option one: Green");
            System.out.println("Option two: Blue");
            System.out.println("Option three: Red");
            System.out.println("Option four: Yellow");
            System.out.println("Please print number 1,2,3,4: ");
            num = sc.nextInt();
        }while (num < 1 || num > 4);

        switch (num){
            case 1:
                System.out.println("Green");
                break;
            case 2:
                System.out.println("Blue");
                break;
            case 3:
                System.out.println("Red");
                break;
            case 4:
                System.out.println("Yellow");
                break;
            default:
                System.out.println("no TYPE");
                break;
        }
    }
}
