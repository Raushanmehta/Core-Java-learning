class EkClass{
    int a ;

    public int getA() {
        return a;
    }

    EkClass(int v){
        a = v; 
    }
    public int returnOne(){
        return 1;
    }
}
public class thisAndSuperKeyword {
    public static void main(String[] args) {
    EkClass e = new EkClass(5);
        System.out.println(e.getA());
    }
}
