class ThreadMeth1 extends Thread{

    public void run(){
        int i = 0;
        while (true){
        System.out.println("Good morning ");
            try {
                Thread.sleep(551);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            i++;
    }
    }
}
class ThreadMeth2 extends Thread{
    public void run() {
        while (true) {
            System.out.println("Thank you");

        }
    }
}
public class threadMethods {
    public static void main(String[] args) {
        ThreadMeth1 t1 = new ThreadMeth1();
        ThreadMeth2 t2 = new ThreadMeth2( );
        t1.start();
       /* try{
            t2.join();
        }
        catch (Exception e){
            System.out.println(e);
        }*/
        t2.start();


    }
}
