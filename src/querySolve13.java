//Problem 1
class MyThreadOne extends Thread {
    public void run() {
        while (true) {

            System.out.println("Good Morning");
        }
    }
}

class MyThreadTwo extends Thread {
    public void run() {
        int i = 0;
        /*while (false) {
            try {
                Thread.sleep(900);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome ");
        }*/
    }
}

public class querySolve13 {
    public static void main(String[] args) {
        MyThreadOne one = new MyThreadOne();
        MyThreadTwo two = new MyThreadTwo();
       // one.setPriority(5);
       // two.setPriority(8);
        System.out.println(one.getPriority());
        System.out.println(two.getPriority());
        System.out.println(two.getState());


       // one.start();
        two.start();
        System.out.println(two.getState());
        System.out.println(Thread.currentThread().getState());
    }
}


//Problem 2


//Problem 3

//Problem 4

//Problem 5