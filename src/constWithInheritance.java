class Base1{

    Base1(){
        System.out.println("I am constructor");
    }
    Base1(int x ){
        System.out.println("I am overloading constructor :" + x);
    }

}
class Derived1 extends Base1{
    Derived1(){
        // super(0);
        System.out.println("I am derived class constructor");
    }
    Derived1(int x ,int y){
       super(x);
        System.out.println("I am overloading constructor in derived class :" + y);
    }

}
class ChildDerived extends Derived1{
    ChildDerived(){
        System.out.println("i am childDerived class constructor");
    }
    ChildDerived(int x , int y, int z){
       super(x,y);
        System.out.println("i am overload childDerived constructor :" + z);
    }
}

public class constWithInheritance {
    public static void main(String[] args) {
        //Base1 ba = new Base1();
        //Derived1 da =new Derived1(14,5);
        ChildDerived cd = new ChildDerived(5,9,3);
    }
}
