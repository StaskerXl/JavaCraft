public class Learn11 {
    public static void main(String[] args) {

        int fall[][] = new int[3][3];
//        System.out.println(fall[1][2]);

        int fallou[][] = {{13,22,44,55},{1,3,4,5}};

        for (int i = 0; i < fallou.length; i++) {
            for (int j = 0; j < fallou[i].length; j++) {
                System.out.print(fallou[i][j] + " ");
            }
            System.out.println("\n");
        }

        int evry[][][] = {
                {{123,434},{12341,452},{654,312}},
                {{11,33},{44,33},{22,55}},
                {{55,22},{56,123},{1234,324}},
        };

        for (int i = 0; i < evry.length; i++) {
            for (int j = 0; j < evry[i].length; j++) {
                for (int k = 0; k < evry[i][j].length; k++) {
                    System.out.print(evry[i][j][k] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }

        int fallafel[][] = new int[4][];
        fallafel[0] = new int[1];
        fallafel[1] = new int[2];
        fallafel[2] = new int[3];
        fallafel[3] = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 1+i; j++) {
                System.out.print(fallafel[i][j] + ",");
            }
            System.out.println();
        }


    }
}
