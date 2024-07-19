public class querySolve7 {
    // 1 write a java method to print multiple table of a number.
    /*static void multiplication(int n){
        for(int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n", n,i, n*i);
        }
    }
    public static void main(String[] args) {
        multiplication(9);*/

    // 2 write a program using function to print following pattern
    /*static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
        public static void main (String[]args){
            pattern1(5);
        }*/

    // 3 Write a revers function  to calculate sum of first n natural number.
    /*static int reverseSum(int n){
        if(n==1){
            return 1;

        }
        return n + reverseSum(n-1);
    }

    public static void main(String[] args) {
        int a = reverseSum(4);
        System.out.println(a);
        */

    // 4 write a function to print the following pattern

    /*static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j >i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
        public static void main (String[]args){
            pattern1(5);*/

    // 5 write a function to print nth term of Fibonacci series using recursion
       static int fibonacci(int n) {
           if (n <= 1) {
               return n;
           }
           return fibonacci(n - 1) + fibonacci(n - 2);
       }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series is " + n +" term");
    for (int i=0; i<n; i++){
            System.out.println(fibonacci(i) + " ");
            }

    // 6 write a function to find average of a set of number passed as arguments

    // 7  write a program using function to print following pattern using recursion.



      /*  public static void pattern(int n) {
            patternRecursive(n, 0);
        }

        private static void patternRecursive(int n, int i) {
            if (i < n) {
                printStars(0, i);
                System.out.println();
                patternRecursive(n, i + 1);
            }
        }

        private static void printStars(int current, int target) {
            if (current < target) {
                System.out.print("*");
                printStars(current + 1, target);
            }
        }

        public static void main(String[] args) {
            pattern(40);
        }
    }*/


    // 8 write a program using function to print following pattern using recursion.

      /*  public static void printReversePattern(int n) {
            if (n == 0) {
                return;
            }
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            printReversePattern(n - 1);
        }

        public static void main(String[] args) {
            int rows = 40;
            int n = 50;
            printReversePattern(rows);
            printReversePattern(n);*/
        }
    }

