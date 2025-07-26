public class Learn7 {
    public static void main(String[] args) {
        //оператор switch
        int katy = 12;
        switch (katy){
            case 11:
                System.out.println("katy = 11");
                break;
            case 12:
                System.out.println("katy = 12");
                break;
            case 13:
                System.out.println("katy = 13");
                break;
            default:
                System.out.println("default");
        }
        String bob = "bob";
        switch (bob){
            case "bob":
                System.out.println("katy = 11");
                break;
            case "bobs":
                System.out.println("katy = 12");
                break;
            case "boba":
                System.out.println("katy = 13");
                break;
            default:
                System.out.println("default");
        }
        int month = 4;
        String season = null;
        switch (month){
            case 1:
                season = "winter";
                break;
            case 2:
            case 3:
                season = "spring";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                season = "Fall";
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                System.out.println("season");
        }
        System.out.println(season);

    }
}
