/*

class Student{
    private int id;
    private String name;

    public Student(){
        id = 5;
        name = "Raj";
    }
    public Student(int myId, String myName){
        id = myId;
        name = myName;
    }
    public Student(String myName){
        id =1;
        name= myName;
    }
    public String getName(){return name;}
    public void setName(String n){this.name =n;}
    public void setId(int i){this.id = i;}
    public int getId(){return id;}
}


public class constructor {
    public static void main(String[] args) {
       // Student raj = new  Student ();
        Student raj = new  Student (25,"computer engineer");
        System.out.println(raj.getId());
        System.out.println(raj.getName());
    }
}

*/


// Query overload the Employee constructor to initialize the salary to 10000;

class MainEmployee{
    int id;
    int salary;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public MainEmployee(){
        id = 12;
        salary = 10000;
        name = "Rahul";
    }
    public MainEmployee(int myId, int mySalary, String myName){
        id = myId;
        salary = mySalary;
        name = myName;
    }


    public static void main(String[] args) {
        MainEmployee raw = new MainEmployee(20, 10000, "Rajan" );
        System.out.println(raw.getId());
        System.out.println(raw.getSalary());
        System.out.println(raw.getName());
    }
}

