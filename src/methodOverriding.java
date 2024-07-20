
class A{
    public int a;
    public int Raw(){
        return 4;
    }
    public void  meth2(){
        System.out.println("I am method 2 class of A");
    }
}
 class B extends A{
     @Override
     public void  meth2(){
         System.out.println("I am method 2 class of B");
     } public void  meth3(){
         System.out.println("I am method 3 class of B");
     }

 }
public class methodOverriding {
    public static void main(String[] args) {
    A a = new A();
    a.meth2();

    B b =new B();
    b.meth2();
    }
}
