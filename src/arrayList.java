import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(3);
        l1.add(9);
        l1.add(4);
        l1.add(6);
        for (int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
           // System.out.println(l1.contains(45));
            System.out.print(l1.set(3,515));
            System.out.print(",");
        }
    }
}
