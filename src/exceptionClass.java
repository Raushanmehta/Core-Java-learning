import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return  "I am toString()";
    }
    public String getMessage(){
        return  "I am get message()";
    }
}
public class exceptionClass {
    public static void main(String[] args) {

        int a ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<99){
            try {
                // throw new MyException();
                throw new ArithmeticException("This is Exceptions");
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();

            }
            System.out.println("Finish");
        }
    }
}
