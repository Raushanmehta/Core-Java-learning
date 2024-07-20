class Phone{
    public void on(){
        System.out.println("switch on Phone");
    }public void greet(){
        System.out.println("good morning");
    }
}
class SmartPhone extends Phone{

    public void on(){
        System.out.println("Switch on smart phone");
    } public void welcome(){
        System.out.println("Aap ka welcome hai");
    }
}
public class dynamicMethodDispatch {
    public static void main(String[] args) {
        //Phone one = new Phone();
        //SmartPhone smart = new SmartPhone();
        //one.name();

        Phone obj = new SmartPhone();  // this is run time polymorphism kyu ki object creation in rum time
        obj.greet();
        obj.on();



    }
}
