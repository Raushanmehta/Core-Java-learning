/*
interface Bicycle {
    int a = 45; // implicitly public, static, and final
    void applyBrake(int decrement); // corrected method name
    void speedUp(int increment);
}

class AvonCycle implements Bicycle ,CarHorn{
    void blowHorn() {
        System.out.println("Pee pee poo poo");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Speeding Up");
    }
    public void BmwHorn(){
        System.out.println("I am Bmw horn pee pee poo pee");
    }
    public void  AudiHorn(){
        System.out.println("I am Audi Horn pee pee poo poo");
    }
}
interface CarHorn{
     void BmwHorn();
       void AudiHorn();
}
*/
interface MyCamera{
    void TakeSnap();
    void RecordVideo();
    private void greet(){
        System.out.println("Hello ram ram ji");
    }
    default void Record4kVideo(){
        greet();
        System.out.println("record in 4k Video");
    }
}
interface MyWifi{
    String[] getNetwork();
    void ConnectionToNetwork(String network);
}
class MyCellPhone{
    void CallingNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }
    void PickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
public void TakeSnap(){

    System.out.println("Taking Snap");

}
public void RecordVideo() {
        System.out.println("Taking Video");
    }
   /* public void Record4kVideo() {
        System.out.println("Recording 4k video in");
    }*/

public String [] getNetwork(){
    System.out.println("Getting list network");
    String[] networkList = {"rahul","raj","rajan"};
    return networkList;
}
public void  ConnectionToNetwork(String network){
    System.out.println("Connecting..."+ network);
}
}

public class intFace {
    public static void main(String[] args) {
        MySmartPhone sc = new MySmartPhone();
        sc.Record4kVideo();
        String[] ar = sc.getNetwork();
        for (String item:ar){
            System.out.println(item);
        }





      /*  AvonCycle a = new AvonCycle();
        a.applyBrake(4);
        // you can create properties in Interface
        System.out.println(a.a);
        //you cannot modify the properties as they are final// a.a= 45;
        a.BmwHorn();
        a.AudiHorn();*/



      }
}