
class  NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return  "Radius cannot be negative!()";
    }
    @Override
    public String getMessage(){
        return  "I am get message()";
    }
}
public class throwAndThrows {

    public static double area(int r ) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI *  r * r;
        return result;
    }
 public static int divide(int a, int b) throws ArithmeticException {

        int result = a/b;
        return result;
    }
    public static void main(String[] args) {

     try {
        // int c = divide(5,0);
      //   System.out.println(c);
         double ar = area(5);
     }catch (Exception e){
         System.out.println("Exception");
     }

    }
}
