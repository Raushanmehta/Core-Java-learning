
public class querySolve6 {
    public static void main(String[] args) {

        // 1 array of  5 float and calculate their sum
    /*float  [] number = {56.5f,69.5f,64.5f,65.4f,98.5f};
    float sum = 0.0f;
    for (float num: number) {
        sum += num;
        System.out.println("sum of array " + sum);
    }*/

        // 2 write a program to find whether a given integer is present ina array or not
       /*float  [] marks = {56.5f,69.5f,64.5f,65.4f,98.5f};
        float num = 56.5f;
        boolean isInArray = false;
        for(float element: marks){
            if(num == element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in array");
        }
        else {
            System.out.println("The value is not present in array");
        }*/

        // 3 average marks in from an array containing marks of all student in physics using for each loop.
        /*float  [] marks = {56.5f,69.5f,64.5f,65.4f,98.5f};
        float sum = 0;
        for( float element: marks) {
            sum = sum + element;
        }
            System.out.println("The average value is "+sum/marks.length);*/

        // 4 create a java program to add two matrices of size 2x3.
       /* int[][] mat1 = {{1,2,3},{4,5,6}};
        int[][] mat2 = {{2,6,13},{3,7,1}};
        int[][] result = {{0,0,0},{0,0,0}};

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) { // Fixed the loop index
                System.out.format("setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
         }
        // print the element of 2-D array
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) { // Fixed the loop index
                System.out.print(result[i][j]+" ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }*/

        // 5 write a java program to revers an array
       /* int [] arr = {2,5,6,5,4};
        int l =arr.length;
        int  n = Math.floorDiv(arr.length,2);
        int temp;
        for(int i=0; i<n; i++){
            // swap a[i] nad a [l-1-i]
            //[3] [2] []
            temp = arr[i];
            arr[i]= arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for(int element: arr){
            System.out.print(element +" ");
        }*/


        // 6 write a java program find the maximum element in a java array
        /*int [] ele = {2,8,2,5,85,3,5,5,568};
        int max = 0;
        for (int e: ele){
            if (e>max){
                max = e;

            }
        }
        System.out.println(max);*/

        // 7 write a java program find the minimum element in a java array
       /* int [] arr = {2,8,2,5,85,3,5,5,568};
        int min = Integer.MIN_VALUE;
        for (int e: arr){
            if (e>min)
               min = e;

            }
        }
        System.out.println(min);
*/

        // 8 write the java program to find whether an array is sorted or not.
      /*  boolean isSorted = true;
        int [] num = {1,2,3,4,15,6,7,8,9};
        for(int i = 0; i<num.length-1; i++){
            if (num[i] > num[i+1]){
              isSorted = false;
              break;
            }
        }
            if(isSorted){
                System.out.println("the array is sorted");
            }
            else {
                System.out.println("array is not sorted");
            }
*/
    }

}
