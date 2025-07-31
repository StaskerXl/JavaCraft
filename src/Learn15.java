public class Learn15 {
    public static void main(String[] args) {

        class Zebra{

            public int age;
            public String name;
            Zebra(){
                System.out.println("New zebra");
                talk();
            }
            Zebra(String name, int age){
                this.name = name;
                this.age = age;
                System.out.println("New zebra");
                age = 1;
                talk();
            }


            public void talk(){
                System.out.println("Wow, my name is " + name + " and my age " + age);

            }

            public void ageUp(){
                age++;
                System.out.println("I am now " + age);
            }
        }

        Zebra zebra1 = new Zebra("Bob", 10);
        zebra1.ageUp();
        Zebra zebra2 = new Zebra("Lamy", 10);
        zebra2.ageUp();
        Zebra zebra3 = new Zebra("Deny", 10);
        zebra3.ageUp();

    }
}
