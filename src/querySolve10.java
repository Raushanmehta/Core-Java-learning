class Circles {
    public int radius;
    Circles(int r) {
        System.out.println("I am circle radius");
        this.radius = r;
    }
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circles {
    public int height;
    Cylinder1(int r, int h) {
        super(r);
        System.out.println("I am cylinder in construction");
        this.height = h;
    }
    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class querySolve10 {
    public static void main(String[] args) {
        // Problem 1
        Cylinder1 sc = new Cylinder1(5, 8);

    }
}
