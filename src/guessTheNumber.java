import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        /*
        Create a class Game which allow a user to play "Guess the number "
        game once. Game should have the following method.
        1. Constructor to generate the random number.
        2. takenUserInput() to take a user input of number.
        3. isCorrectNumber() to detect weather the number entered by the user is true
        4. getter and setter for noOfGuesses
        use properties such as noOfGuesses(int), etc to get this task none;
         */


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerNumber  =random.nextInt(20);

        if (userInput == computerNumber){
            System.out.println("True");
        }
        System.out.println(computerNumber);
    }
}
