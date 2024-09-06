import java.util.Scanner;

public class handlingException {
    public static void main(String[] args) {
       int[] marks = new int[5];
       marks[0] = 86;
       marks[1] = 7;
       marks[2] = 5;
       marks[3] = 55;
       marks[4] = 62;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array index value");
        sc.nextInt();
        int ind =sc.nextInt();

        System.out.println("Enter the number you want to divided the value");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is : "+ marks[ind]);
            System.out.println("The value of array-value number is : " + marks[ind]/number);
        }catch (ArithmeticException e){
            System.out.println("Some ArithmeticException occur!");
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Some ArrayIndexOutOfBoundsException occur!");
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Some Exception occur!");
            System.out.println(e);
        }
    }
}
