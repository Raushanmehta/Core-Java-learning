import java.util.Scanner;

public class nestedTryAndCatch {
    public static void main(String[] args) {

        int[] marks = new int[5];
        marks[0] = 5;
        marks[1] = 25;
        marks[2] = 32;
        marks[3] = 85;
        marks[4] = 9;

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of array of index");
            int index = sc.nextInt();
            try {
                System.out.println("Welcome to nested try and catch");
                try {
                    System.out.println(marks[index]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index is not available");
                    System.out.println("Exception is level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception is level 1");
            }
        }
    }
}
