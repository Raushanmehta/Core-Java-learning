 //prob/em 1 or 2
/*abstract class Pen{
   abstract void Write();
   abstract void Refill();
}
class  FountainPen extends Pen{
    void  Write(){
        System.out.println("Write");
    }
    void Refill(){
        System.out.println("Refill");
    }void ChangeNib(){
        System.out.println("ChangeNib");
    }
}*/
 //problem 3or 5
 /*class Monkey{
    void Jump(){
        System.out.println("Jump");
    }
    void Bite(){
        System.out.println("Bite");
    }
 }
 interface  BasicAnimal{
void Eat();
void Sleep();
 }
 class Human extends Monkey implements BasicAnimal{
void Speak(){
    System.out.println("Speak");
}
public void Eat(){
    System.out.println("Eat");
}
public void Sleep(){
    System.out.println("Sleep");
}

 }
*/
 //problem 4
/*
 abstract class Telephone{
    abstract void Ring();
    abstract void Lift();
    abstract void Disconnect();
 }
 class  SmartTelephone extends  Telephone{
public void Camera(){
    System.out.println("Open camera smart telephone");
}
public void Ring(){
    System.out.println("Ring the  telephone");
}
public void Lift(){
    System.out.println("Lift the Telephone");
}
public void Disconnect(){
    System.out.println("disconnect the telephone");
}
 }
*/
 //problem 6 or 7
 interface TvRemote{
     void OnTv();
     void OffTv();
     void ChangeChannel();
 }
 class Tv{
     void VolumeUp(){
         System.out.println(" i am Tv class volumeUp increase");
     }
 }
 class  SmartTvRemote extends Tv implements TvRemote{
    public void Alexa(){
         System.out.println("Hello alexa change the channel");
     }
    public void Youtube(){
         System.out.println("Open Youtube");
     }
     public void OnTv(){
         System.out.println("Open the Tv");
     }
     public void OffTv(){
         System.out.println("Off the Tv");
     }public void ChangeChannel(){
         System.out.println("ChangeChannel the Tv channel");
     }

 }

public class querySolve11 {
    public static void main(String[] args) {
        //problem 1 or 2
        /*FountainPen sc = new FountainPen();
        sc.ChangeNib();*/
        //problem 3
        /*  Human sc =new Human();
       // sc.Speak();*/
        //problem 5
        /* Monkey m=new Human();
        //m.Speak(); can not speak method because the reference is monkey which is monkey is not speaks.
        m.Bite();
        m.Jump();
        BasicAnimal B =new Human();
       // B.Speak(); can not speak method because the reference is BasicAnimal which is BasicAnimal is not speaks.
        B.Eat();
        B.Sleep();*/
        //Problem 4
        /* Telephone t = new SmartTelephone();
        //t.Camera(); can not camera method because the reference is Telephone which is telephone is not camera.
        t.Disconnect();
        t.Ring();

        SmartTelephone s =new SmartTelephone();
        s.Camera();
        s.Disconnect();*/
        //problem 6 or 7
        TvRemote tv =new SmartTvRemote();
        //Tv.Youtube(); can not Youtube method because the reference is TvRemote which is TvRemote is not Youtube.
        tv.OnTv();
        tv.ChangeChannel();


        SmartTvRemote smart=new  SmartTvRemote();
        smart.Youtube();
        smart.Alexa();
        smart.ChangeChannel();
        smart.VolumeUp();



    }
}
