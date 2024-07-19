class Employees {
    private int salary;
    private String name;

    public Employees() {
        salary = 10000;
        name = "Raj";
    }
    public Employees(String myName , int mySalary){
        name = myName;
        salary = mySalary;

    }


    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSalary(int s) {
        salary = s;
    }

    public int getSalary() {
        return salary;
    }
}
public class overConst {
    public static void main(String[] args) {
        Employees sa = new Employees("rajan",203323);
        System.out.println(sa.getName());
        System.out.println(sa.getSalary());

    }
}
