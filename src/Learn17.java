class Potato{

    static int number = 50;

    final String NUMBER_OF_WHEELS = "4";

    static {
        System.out.println("YUM!");
    }

    static void mollean(int number){
        System.out.println(number * 2);
    }

}

class StaticAble{
    static int a = 3;
    static int b;
    static int s;


    static{
        System.out.println("Static block");
        b =  a * 4;
    }

    void how(int s){
        System.out.println(b);
        this.s = s;
        System.out.println(b + s);
    }

}

public class Learn17 {

    public static void main(String[] args) {

        Potato jarry = new Potato();
        Potato.number = 10;
        System.out.println(Potato.number);
        Potato.mollean(50);

        StaticAble able = new StaticAble();

        able.how(14);

    }
}
