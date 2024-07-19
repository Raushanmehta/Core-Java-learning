import java.util.Arrays;
import java.util.Scanner;


/*class circle{
    int radius;
    public double area(){return 3.14 * radius * radius;}
}
public class QuestionBankExam {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        circle arr = new circle();
        arr.radius = 5;
        System.out.println(arr.radius);*/




        /*int [] arr= {1,5,2,5,4};
        for (int element: arr ){
            System.out.println(element);
        }*/

       /* System.out.println("Enter the days");
        int week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not week number");
        }
*/

       /* System.out.println("Enter your percentage");
        float per = sc.nextInt();
        if (per >= 80 && per <= 100) {
            System.out.println("First class");
        } else if (per >= 60 && per < 80) { // Corrected logical condition
            System.out.println("Second class");
        } else {
            System.out.println("Fail");
        }
        sc.close();*/

        // create an array
        /*int [] array = { 8, 9, 10, 11, 12 };

        // getting array length
        int length = array.length;

        // default sum value.
        int sum = 0;

        // sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / length;

        System.out.println("Average of array : "+average);

*/
        // Define the matrices
       /* int[][] matrix1 = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7},
                           {6, 5, 4},
                           {3, 2, 1}};

        // Perform matrix multiplication
        int[][] result = multiplyMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Method to perform matrix multiplication
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        // Check if matrices can be multiplied
        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied.");
            return null;
        }

        // Create the result matrix
        int[][] result = new int[rows1][cols2];

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;*/

/*
public class  QuestionBankExam {
    double length;
    double width;
    double height;

    // Default constructor
    public QuestionBankExam() {
        length = 1.0;
        width = 1.0;
        height = 1.0;
    }

    // Parameterized constructor with one parameter
    public QuestionBankExam(double side) {
        length = side;
        width = side;
        height = side;
    }

    // Parameterized constructor with three parameters
    public QuestionBankExam(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // Method to calculate volume of the box
    public double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        QuestionBankExam box1 = new QuestionBankExam();           // Default constructor
        QuestionBankExam box2 = new QuestionBankExam(2.0);        // Parameterized constructor with one parameter
        QuestionBankExam box3 = new QuestionBankExam(3.0, 4.0, 5.0);  // Parameterized constructor with three parameters

        // Display volumes of the boxes
        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
    }
}
*/

      /*  class MyObject {
            int value;

            MyObject(int value) {
                this.value = value;
            }

            // Method to display the value of MyObject
            void display() {
                System.out.println("Value: " + value);
            }
        }

        public class QuestionBankExam {
            public static void main(String[] args) {
                MyObject obj = new MyObject(10);

                System.out.println("Before passing the object to the method:");
                obj.display();

                // Passing the object to the method
                MyObject returnedObj = modifyObject(obj);

                System.out.println("After passing the object to the method:");
                returnedObj.display();
            }

            // Method that accepts a MyObject instance and returns it after modification
            public static MyObject modifyObject(MyObject obj) {
                // Modifying the object's value
                obj.value += 5;
                // Returning the modified object
                return obj;



            }
        }*/




