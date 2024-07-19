import java.util.Scanner;
public class conditionalMethod {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        switch(age){
            case 10:
                System.out.println("your are child");
                break;
            case 18:
                System.out.println("your are adult");
                break;
            case 28:
                System.out.println("your are young");
                break;
            default:
                System.out.println("enjoy your" + age);
        }

    }

}
