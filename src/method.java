import org.w3c.dom.ls.LSOutput;

public class method {

       /* static int logic(int x, int y){
            int z;
            if(x>y){
                z = x*y;
            }
            else{
                z = (x+y)*5;
            }
            return z;
        }
        public static void main(String[]args){
            int a = 5;
            int b = 4;
            int c;
            c = logic(a,b);
            int a1 = 2;
            int b1 = 3;
            int c1;
            c1 = logic(a1,b1);
            System.out.println(c);
            System.out.println(c1);
*/


   /* static void change(int a) {
        a = 98;
    }
    static void change2(int []arr) {
        arr[0] = 88;
    }

    public static void main(String[] args) {
        //case 1
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is: " + x);
        // case 2
    int [ ]marks = {98,65,94,96,78,54,97};
    change2(marks);
    System.out.println("the value of x after the running change: "+ marks[0]);
*/


    //method overloading
   /*     static void foo(){
            System.out.println("Good morning brother");
        }
        static void foo(int a) {
            System.out.println("Good morning" + a + " bro");
        }

    public static void main(String[] args) {

    foo();*/

    //variable argument varargs
   /*static int sum(int ...arr) {
       int result = 0;
       for (int a : arr) {
           result += a;
       }
       return result;
   }
    public static void main(String[] args) {

        System.out.println("welcome to varargs");
        System.out.println("The sum of 4 and 5 is: " + sum(4,5));
        System.out.println("The sum of 4 and 5 is: " + sum(3,4,5));
        System.out.println("The sum of 4 and 5 is: " + sum(2,3,4,5));
        System.out.println("The sum of 4 and 5 is: " + sum(1,2,3,4,5));
*/


    //recursion

        /*static int  factorial( int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("The value of factorial n is: "+ factorial(n));*/

    /*static int  factorial_iterative( int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i=1; i<=n;i++){
                product *= i;
        }
            return product;
    }

}

    public static void main(String[] args) {
        int x = 5;
        System.out.println("the value of factorial iterative is :" + factorial_iterative(x));*/

    // fibonacci number

    //Sure, here's a Java code snippet for calculating Fibonacci numbers using recursion:


    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}




