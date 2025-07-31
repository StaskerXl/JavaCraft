class Eclipce{
    static boolean isGood = true;
    static String focus = "Отвлекает от дыма";
    static String fine = "Поднимает настроение";
    static String money = "Дешевле сигарет";
}

public class Main {

    public static void main(String[] args) {

        if (Eclipce.isGood == true &&
        Eclipce.focus == "Отвлекает от дыма" &&
        Eclipce.fine == "Поднимает настроение" &&
        Eclipce.money == "Дешевле сигарет") {
            System.out.println("Это хорошо = " + Eclipce.isGood +  "\n" + Eclipce.focus+
                    "\n" + Eclipce.fine + "\n" + Eclipce.money);
        }

    }
}