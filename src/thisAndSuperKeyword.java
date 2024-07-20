class EkClass{
    int a ;

    public int getA() {
        return a;
    }

    EkClass(int a){
        this.a = a;
    }
    public int returnOne(){

        return 1;
    }
}

class DoClass extends EkClass {
    DoClass(int c){
        super(c);
        System.out.println("I am constructor :" +c);
    }
}
public class thisAndSuperKeyword {
    public static void main(String[] args) {
    EkClass e = new EkClass(55);
    DoClass d = new DoClass(36);
        System.out.println(e.getA());
    }
}
