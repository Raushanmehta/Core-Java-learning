
    interface Bicycle{
    int a =45;
        void applyBreak(int decrement);
        void speedUp(int increment);
    }
    class AvonCycle implements Bicycle{
        void blowHorn(){
            System.out.println("Pee pee poo poo");
        }
       public void applyBrake(int decrement){
            System.out.println("Applying Brake");
        }
       public void  speedUp(int increment){
            System.out.println("Applying Brake");
        }
    }
    public class interfaceClass {
    public static void main(String[] args) {
        AvonCycle a = new AvonCycle();{
            a.applyBrake(4);
        }

    }
}
