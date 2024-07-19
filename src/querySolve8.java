// 1 Problem create a class employ with following properties and method
/*
class Student {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;

    }
}
public class querySolve8 {
    public static void main(String[] args) {

        Student  raj = new Student();
        raj.setName("Rajan");
        raj.salary=5488;
        System.out.println(raj.getSalary());
        System.out.println(raj.getName());
    }
}*/

// 2 problem create a class cellphone with method  to print "ringing" "vibrating" etc

/*
class cellPhone {

 public void ringing() {
  System.out.println("Ringing...");
 }

 public void vibrating() {
  System.out.println("Vibrating...");
 }

 public void call() {
  System.out.println("Call...");
 }
}
public class querySolve8 {
 public static void main(String[] args) {

  cellPhone apple = new cellPhone();
  apple.ringing();
  apple.vibrating();
  apple.call();
 }
}
*/

// 3 problem create a class square with method  to initialize its side , calculating area, parameter

/*class Square {
 int side;

 public int area() {
  return side* side;
 }
 public int perimeter() {
  return 4*side;
 }
}

public class querySolve8{
 public static void main(String[] args) {
  Square sides = new Square();
  sides.side= 4;
  System.out.println(sides.area());
  System.out.println(sides.perimeter());

 }
}*/

// 4 problem create a rectangle 8 repeat 3




/*class Rectangle{
 int length;
 int breath;
 public int area(){
  return length * breath;
 }
 public  int perimeter(){
  return 2*length*breath;
 }
}
public class querySolve8 {
 public static void main(String[] args) {

  Rectangle rec = new Rectangle();
  rec.length=20;
  rec.breath=20;
  System.out.println(rec.area());
  System.out.println(rec.perimeter());

 }
}*/
 // 5 create a class Tommy for Rockstar game capable of hitting ("print hitting") running, firing etc.


/*class Tommy{
    String Game;

    public void hitting(){
        System.out.println("Hitting..");
        return;
    }
    public void running(){
        System.out.println("Running..");
        return;
    }
    public void firing(){
        System.out.println("Firing..");
        return;
    }

}
public class querySolve8{
    public static void main(String[] args) {
        Tommy src = new Tommy();
        src.hitting();
        src.running();
        src.firing();
    }
}*/

// 6 problem repeat 4 for circle


class Circle{
    int radius;
    public double area(){
        return 3.14149*radius*radius;
    }
    public double perimeter(){
        return 2*3.14159*radius;
    }
}
public class querySolve8{
    public static void main(String[] args) {
      Circle  cir = new Circle();
        cir.radius = 4;
        System.out.println(cir.area());
        System.out.println(cir.perimeter());
    }
}


