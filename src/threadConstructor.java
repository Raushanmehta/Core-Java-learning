import java.util.*;
class MyThreads  extends Thread{
    public MyThreads(String name){
        super(name);
    }
    public  void run(){
        int i = 31;
        System.out.println("thank you ");
 //       while (true){
   //         System.out.println("I am thread");
     //   }
    }
}

class RunnableThread implements Runnable{
    String name;
    RunnableThread(String name){
        this.name = name;
    }
    public void run(){
        System.out.println("Hello I am Runnable thread");
    }
}
public class threadConstructor {
    public static void main(String[] args) {
        MyThreads t = new MyThreads( "Hello");
        t.start();


        System.out.println("This id of thread t is " + t.getId());
        System.out.println("This name of thread t is " + t.getName());
        System.out.println("This Priority of thread t is " + t.getPriority());

RunnableThread r= new RunnableThread("Runnable");
r.run();
        System.out.println("This is runnable thread " + r.getClass());
        System.out.println("This is runnable thread " + r.hashCode());
        System.out.println("This is runnable thread " + r.name);
    }
}
