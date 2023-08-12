package programs.patterns;

public class StarPattern2 {

    public static void main(String[] args) {

        for (int i=0; i<=4; i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
            /**
             *      *
             *     **
             *    ***
             *   ****
             *  ***** */
        }


        System.out.println("--------------------------------------------");

        for (int l=0;l<=3;l++){
            for(int m=3;m>=l;m--){
                System.out.print(" ");
            }
            for (int n=0;n<=l;n++){
                System.out.print(" *");
            }
            System.out.println();
            /**
             *     *
             *    * *
             *   * * *
             *  * * * *   */
        }



    }

}
