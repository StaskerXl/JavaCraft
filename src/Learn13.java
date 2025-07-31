public class Learn13 {
    public static void main(String[] args) {


        class Human {
            String name;
            int age;
            boolean isMale;
        }

        Human human1 = new Human();

        human1.name = "Tony";
        human1.isMale = true;
        human1.age = 20;

        System.out.println(human1.age);
        System.out.println(human1.isMale);
        System.out.println(human1.name);

        Human human2 = new Human();

        human2.name = "Any";
        human2.isMale = false;
        human2.age = 22;

        System.out.println(human2.age);
        System.out.println(human2.isMale);
        System.out.println(human2.name);


    }
}
