    class MyPrio extends Thread{
    public MyPrio(String name){
        super(name);
    }
    public void run(){
        int i = 20;
        while (true ){
            System.out.println("I am  runnable " + this.getName());

        }

    }
}



public class Priority1 {
    public static void main(String[] args) {

        MyPrio p1 = new MyPrio("Priority1(Most important!");
        MyPrio p2 = new MyPrio("Priority2");
        MyPrio p3 = new MyPrio("Priority3");
        MyPrio p4 = new MyPrio("Priority4");
        MyPrio p5 = new MyPrio("Priority5");
        p1.setPriority(Thread.MAX_PRIORITY);
        p1.start();
        p2.setPriority(MyThread1.MIN_PRIORITY);
        p2.start();
        p3.start();
        p4.start();
        p5.start();


    }
}
