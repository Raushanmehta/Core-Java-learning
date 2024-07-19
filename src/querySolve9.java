import java.awt.*;

class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }


}
    class Rectangle{
    private int length;
    private int breath;
    public Rectangle(){
        this.length = 5;
        this.breath =10;
    }

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

        public Rectangle(int length, int breath) {
            this.length = length;
            this.breath = breath;
        }
        public double rectangle(){return  length * breath;}
    }

    class Sphere{
    private int radius;

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }
        public Sphere(int radius){
            this.radius = radius;
        }
        public double sphere(){return 4 * Math.PI * radius * radius; }
    }

public class querySolve9 {
    public static void main(String[] args) {
        // problem 1
        Cylinder myCylinder = new Cylinder( 8,15);
        myCylinder.setHeight(10);
        int h = myCylinder.getHeight();
        System.out.println( "Height of cylinder :" +h);

        // problem 2
        myCylinder.setRadius(4);
        int r = myCylinder.getRadius();
        System.out.println("Radius of cylinder :" +r);
        System.out.println("Area of Cylinder :" + myCylinder.surfaceArea());
        System.out.println("Volume of Cylinder :" + myCylinder.volume());

        // problem 4

        Rectangle rc =new Rectangle(4,5);
        System.out.println("Area of rectangle :" + rc.rectangle());

        // problem 5

        Sphere race = new Sphere(4);
        System.out.println("Area of  sphere  :" +race.sphere());






    }
}


