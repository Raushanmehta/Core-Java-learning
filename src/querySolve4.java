import java.util.Random;
import java.util.Scanner;
public class querySolve4 {


        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);




        /*System.out.println("enter your number");
        int a = sc.nextInt();
        if(a>=11) {
            System.out.println("I am " + a);
        }
            else{
            System.out.println("I am not 11");
        }*/

        /*    System.out.println("Enter your marks maths");
            int a = sc.nextInt();
            System.out.println("Enter your marks Hindi");
            int b = sc.nextInt();
            System.out.println("Enter your marks English");
            int c = sc.nextInt();
            System.out.println("Enter your marks History");
            int d = sc.nextInt();
            System.out.println("Enter your marks Science");
            int e = sc.nextInt();
            float  sum = (a+b+c+d+e);
            System.out.println("Your total marks "+sum);
            float per =((sum / 500) * 100);
            System.out.println("Your"+per+"%");
            if (per>33 && per<=90){
                System.out.println("Pass");
            } else if ( per>=90 && per<=100) {
                System.out.println("Topper");
            } else{
                System.out.println("Fail");
            }*/


        /* System.out.println("Enter your annual income");
        float income = sc.nextFloat();
        float tax = 0;
        if(income<250000f){
            tax =tax +0;
        } else if (income>250000f && income<=500000f) {
            tax =tax+0.05f * (income - 250000f);
        }
        else if (income>500000f && income<=1000000f){
            tax = tax +0.05f * (5% - 250000f);
            tax =tax +0.2f * (income - 500000f);
        } else if (income>1000000f) {
            tax= tax +0.05f * (5% - 250000f);
            tax = tax +0.2f * (10% - 500000f);
            tax = tax +0.3f * (income - 1000000f);
        }
        System.out.println("The total tax paid is" + tax);
        */

        /*  System.out.println("enter your nuber");
        int num = sc.nextInt();

        if (num% 5==0){
            System.out.println("This is multiple of 5");
        }
        else {
            System.out.println("This not multiple of 5");
        }
        */

        /*  System.out.println("Enter week number");
        int week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Have a nice day" + week);
        }
        if (week>=8){
            System.out.println(week +"is not week day");
        }
      */

        /* System.out.println("Enter your year");
        int year = sc.nextInt();
        if (year%4==0&& year%100!=0||year%400==0){
            System.out.println("this id leap year");
        }
        else {
            System.out.println("this is not leap year");
        }*/

        /*System.out.println("Enter your url");
        String url =sc.toString();
         switch (url){
             case .com :
             System.out.println("This is Commercial website");
             break;
             case .org:
             System.out.println("This is Organization website");
             break;
             case .in:
             System.out.println("This is Indian website");
             default:
                 System.out.println("This is not found");
         }
        */

            //new rock paper scissor
            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for scissor");
            int userInput = sc.nextInt();

            Random random = new Random();
            int computerInput = random.nextInt(3);

            if(userInput ==computerInput){
                System.out.println("Draw");
            }
            else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0||userInput==2&&computerInput==1){
                System.out.println("You Win");
            }else{
                System.out.println("Computer Win");
            }
            //System.out.println("Computer choice " +computerInput);

            if (computerInput==0){
                System.out.println("Computer choice: Rock");
            }
            if (computerInput==1){
                System.out.println("Computer choice: Paper");
            }
            if (computerInput==2){
                System.out.println("Computer choice: scissor");
            }






        }
    }


