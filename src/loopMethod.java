import java.util.Scanner;
public class loopMethod {


        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);

        /*int i = 100;
        while (i<=200){
            System.out.println(i);
            i++;
        }

            System.out.println("End loop");
       */

        /*   int b = 0;
        do {
            System.out.println(b);
            b++;
        }while (b<=100);
        */

        /*int a = 0;
        for ( a=0; a<=10; a++){
            System.out.println(a);
        }
        */


        /*for(int i=0; i<10;i++){
            System.out.println(i);
        }
        */

        /*for (int i = 10; i != 0; i--){
            System.out.println(i);
        }
        */

        /*int a = 0;
        for( a=100; a!=0; a--){
            System.out.println(a);
        }*/


            //brake
        /*for ( int i=0; i<7;i++){
            System.out.println(i);
            System.out.println("java is grate");
            if (i==3){
                System.out.println("End of the loop");
                break;
            }
        }*/
        /*int  i=0;
        while ( i<8){
            System.out.println(i);
            System.out.println("java is grate");
            if (i==4){
                System.out.println("end od the loop");
                break;
            }
            i++;
        }
        System.out.println("loop end here");*/


        /*int i=0;
        do {
            System.out.println(i);
            System.out.println("java is grate");
            if (i == 5) {
                System.out.println("end of the loop");
                break;
            }
            i++;
            } while(i<8);
                System.out.println("loop end here");
         */

            //continue
         /*for ( int i=0; i<7;i++){
            if (i==3){
                System.out.println("End of the loop");
                continue;
            }
             System.out.println(i);
             System.out.println("java is grate");
        }
*/
            int i=0;
            do {
                i++;
                if (i == 5) {
                    System.out.println("end of the loop");
                    continue;
                }

                System.out.println(i);
                System.out.println("java is grate");

            } while(i<8);
            System.out.println("loop end here");



        }
    }


