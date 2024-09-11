public class finallyBlock {
    public static int greet(){
        try {
            int a = 50;
            int b = 10;
            int c = a/b;
            return c ;

        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("This is the end of this program");
        }
        return -1;
    }
    public static void main(String[] args) {
      int k =  greet();
        System.out.println(k);

        int a= 8;
        int b= 3;
        while (true){
            try {
                System.out.println(a/b);
            }catch (Exception e){
                System.out.println(e);
                break;
            }finally {
                System.out.println("I am for value of b" + b);
            }
            b--;
        }
    }
}
