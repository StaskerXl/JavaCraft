public class Learn6 {
    public static void main(String[] args) {
        // Оператор if

        int mayAge= 20;

        int requiredAge = 20;

        if (mayAge == requiredAge){
            //код будет выполняться если условие Истина
            System.out.println("A am cool");
        }else{
            System.out.println("You want Age");
        }

        int x = 10;
        int q = 11;

        if (x == q){
            System.out.println("This not true");
        } else if (x < q) {
            System.out.println("This is true");
        }else {
            System.out.println("Oh no it`s not resoult");
        }

        //Вложенные операторы if

        int sonec = 20;
        int delec = 20;

        if (sonec < 18){
            System.out.println("you yang");
        } else if (sonec >= 18 && delec < 70) {
            if (sonec == 20){
                System.out.println("you 20");
            }else{
                System.out.println("no");
            }
        }else{
            System.out.println("defoult");
        }

        //Однострочный оператор
        if(sonec == 20)
            System.out.println("You is Ok");

        boolean round = true;

        if (round){
            System.out.println("yes");
        } else if (!round) {
            System.out.println("no");
        }

        int tend = 10;
        boolean sonest = false;

        if (tend < 9 || !sonest){
            System.out.println("its ok");
        }

        boolean tets = false;
        System.out.println(tets);

    }
}
