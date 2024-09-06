/*
  You have to create a package named com.learnCode
  This package should have individual classes for Rectangle ,Square, Circle, Cylinder, Sphare
  These classes should use inheritance to properly manage to code!
  Include method like volume , surface area and getter/setter for dimensions
*/

 class Rectangles{

     public int  length = 5;
     public int  breath = 5;

     public int getLength() {
         return length;
     }

     public void setLength(int length) {
         this.length = length;
     }

     public int getBreath() {
         return breath;
     }

     public void setBreath(int breath) {
         this.breath = breath;
     }

     public void run(){
         System.out.println("Area of rectangle :" + length* breath);
     }
}

public class shape {

    public static void main(String[] args) {
Rectangles rec = new Rectangles();
rec.run();
    }
}
