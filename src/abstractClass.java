abstract class Parent{

 public Parent(){
        System.out.println("I am base parent in class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
 class child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    } @Override
    public void greet2(){
        System.out.println("Good morning");
    }
}

abstract class child2 extends Parent{
    public void th(){
        System.out.println("good evening");
    }
}
public class abstractClass {
    public static void main(String[] args) {
       // Parent p = new child();
    child dh = new child();


;    }
}
