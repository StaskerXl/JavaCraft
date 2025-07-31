public class Learn14 {

    public static void main(String[] args){

        class Human{
            int age;
            String name;

            public void mets(){
                System.out.println("i am = " + name + " my age = " + age);
            }

        }

        Human human5 = new Human();
        human5.age = 10;
        human5.name = "garry";

        human5.mets();

    }

}
