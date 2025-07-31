public class LearnX16 {

    static class Tomb{
        protected int structs;
        protected String name;

        public int getStructs() {
            return structs;
        }

        public void setStructs(int structs) {
            this.structs = structs;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Home extends Tomb{
        private int numberStreet;
        private String nameStreet;

        public Home() {
            System.out.println("Вы не задали значения");
        }

        public Home(int numberStreet, String nameStreet,int structs, String name) {
            this.numberStreet = numberStreet;
            this.nameStreet = nameStreet;
            super.name = name;
            super.structs = structs;
        }

        public int getNumberStreet() {
            return numberStreet;
        }

        public void setNumberStreet(int numberStreet) {
            this.numberStreet = numberStreet;
        }

        public String getNameStreet() {
            return nameStreet;
        }

        public void setNameStreet(String nameStreet) {
            this.nameStreet = nameStreet;
        }


        void printInfo(){
            System.out.println("Количество = " + super.getStructs() +
                    " структура = " + super.getName() +
                    " Номер улицы = " + getNumberStreet() +
                    " Имя улицы = " + getNameStreet());

        }

    }

    public static void main(String[] args) {

        Home myHome = new Home(10,"Hello",12,"Tolo");
        myHome.printInfo();
        Home myHome2 = new Home(1,"Hellos",31,"Meto");
        myHome2.printInfo();
        Home myHome3 = new Home(1,"Gosm",8,"Filin");
        myHome3.printInfo();

    }


}
