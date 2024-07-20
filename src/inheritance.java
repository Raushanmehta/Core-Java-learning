class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am base class and setting x  now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am constructor");
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Animal{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printAl(){
        System.out.println("animal");
    }
}
class Dog extends Animal{
    String bark ;

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }
}
public class inheritance {
    public static void main(String[] args) {
        //create object class of base class
    Base b = new Base();
    b.setX(15);
    System.out.println(b.getX());
    // create object class of derived class
    Derived d = new Derived();
    d.setY(12);
        System.out.println(d.getY());

    // create object class of animal class
     Animal a = new Animal();
     a.setName("Dog");
        System.out.println(a.getName());
      Dog s = new Dog();
      s.setName("bark");
        System.out.println(s.getName());
    }
}
