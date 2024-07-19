 class Employee {
           int id;
           int salary;

           String name;
           int  details;
           public void printDetails(){
               System.out.println("My id is " + id);
               System.out.println("and my  name is "+ name);
               System.out.println("and my  salary  is "+ salary);
               System.out.println("and my  details  is "+ details);
           }
           public int getSalary(){
               return salary;
           }

            public int  getDetails(){
                return details;
            }
        }
        public class oops {
    public static void main(String[] args) {

        Employee raw = new Employee(); // instantiating a new employee object
        Employee son = new Employee(); // instantiating a new employee object
        // setting properties
        raw.id = 15;
        raw.salary = 150000;
        raw.name = "raushan_mehta";
        raw.details = 1151;

        son.id =  23;
        son.salary =  230000;
        son.name= "Elvish";
        son.details = 5626;

        raw.printDetails();
        son.printDetails();
        int salary = son.getSalary();
        int details = son.getDetails();
        System.out.println(salary);
        System.out.println(details);
        //System.out.println(raw.id);
        //System.out.println(raw.name);

    }
}

