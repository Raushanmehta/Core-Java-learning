import java.math.MathContext;
public class tryAndCatch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 29;
        try {
            int c = a/b;
            System.out.println("The result is : " + c);
        }
        catch (Exception e){
            System.out.println("sorry ");
            System.out.println(e);
        }

    }
}
