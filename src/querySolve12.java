

import java.util.Scanner;
//Problem 1
/*class Calculator{
    public void calculator(int a ,int b){
        System.out.println("your result is:" +a+b);
    }
}
class  ScCalculator{
public void calculator(int a, int b){
    System.out.println("your result is:"+ Math.sin(a+b));
}
}
class  HybridCalculator{
    public void calculator(int a, int b){
        System.out.println("your result is:" + a+b);
        System.out.println("your result is:" + Math.sin(a+b));
    }
}*/
//Problem 2
/*class  SoundMessage{
        public void playSound(){
            System.out.println("why is sound");
        }
}*/
public class querySolve12 {
    public static void main(String[] args) {
       // Problem 1
       /* System.out.println("i am main method");*/
        //Problem 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Message");
        String userInput = sc.nextLine();

        System.out.println("By using Sound"+userInput);
    }
}
