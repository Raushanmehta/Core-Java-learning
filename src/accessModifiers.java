/*class myEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId( int i){
        this.id = i;
    }
}
public class accessModifiers {
    public static void main(String[] args) {
    myEmployee raw = new myEmployee();
   *//* raw.id = 545;
    raw.name = "i love java";*//*
        raw.setName("Java is most power full person");
        System.out.println(raw.getName());
        raw.setId(155);
        System.out.println(raw.getId());
    }
}*/

// area of circle

class circles {
     double  radius;
    double perimeter;

    public double getRadius(){
       return 3.14*radius*radius;
    }public double setRadius(){
        return 3.14*radius*radius;
    }


    public double getPerimeter(){
        return 2*3.14*radius;
    }
    public double setPerimeter(){
        return 2*3.14*radius;
    }

}
public class accessModifiers{
    public static void main(String[] args) {
        circles sc = new circles();
        sc.radius = 4;
        sc.perimeter = 7;
        System.out.println("Area of circle: "+sc.getRadius());
        System.out.println("Perimeter of circle: "+sc.getPerimeter());
    }
}
