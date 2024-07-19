
public class arrayMethod {
    // import java.util.*;

        public static void main(String[]args) {
            // 1
           /* int [] marks; //Declaration!
            marks = new int[5]; //Memory Allocation*/

            // 2
            /*int [] student = new int[5]; //Declaration and Allocation!
            student[0] = 100;
            student[1] = 50;
            student[2] = 70;
            student[3] = 40;
            student[4] = 90;
            System.out.println(student[1]);*/

            //3
           /* int[] name = {22,50,62,98,94}; //Declaration and initialize then throw the Allocation
            System.out.println(name[4]);*/

            //Array length
            //int[] Marks = {20, 65, 64, 99, 66,};
            // System.out.println(Marks.length);

            //Display the easy method
            /*System.out.println(Marks[0]);
            System.out.println(Marks[1]);
            System.out.println(Marks[2]);
            System.out.println(Marks[3]);
            System.out.println(Marks[4]);*/

            //Display the for loop
            /*for (int i = 0; i < Marks.length; i++)
                System.out.println(Marks[i]);*/

            //Display the for loop revers order
            /*for (int i=Marks.length-1; i>=0; i--)
                System.out.println(Marks[i]);*/

            //Display the array for each loop
            /*for (int element: Marks){
                System.out.println(element);
            }*/

            //multidimensional array
            // int []  marks;  //1-D Array
            int[][] flats; //2-D Array
            flats = new int[2][3];
            flats[0][0] = 101;
            flats[0][1] = 102;
            flats[0][2] = 103;
            flats[1][0] = 201;
            flats[1][1] = 202;
            flats[1][2] = 203;
            System.out.println("using 2-D loop");
            for (int i = 0; i < flats.length; i++) {
                for (int j = 0; j < flats[i].length; i++) {
                    System.out.print(flats[i][j]);
                    System.out.print(" ");
                }

            }


        }
    }


