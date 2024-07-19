
/* create a class game which allow a user to play "guess the number" game
  once. game should have the following method;
  1 constructor to generate th random number
  2 takeUserinput()  to take a use input a number
  3 isCorrectNumber() to detect whether the number entered by the user is true
    user properties such as noOfGuesses(int) etc to get this take done
  */
import java.util.Scanner;

public class querySolve3Oops {
    private int randomNumber;
    private int noOfGuesses;

    // Constructor
    public querySolve3Oops() {
        this.randomNumber = (int) (Math.random() * 100) + 1; // Generates a random number between 1 and 100
        this.noOfGuesses = 0;
    }

    // Method  user input
    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number: 1 to 100 ");
        int userInput = sc.nextInt();
        this.noOfGuesses++;
        if (isCorrectNumber(userInput)) {
            System.out.println("Correct Answer");
        } else {
            System.out.println("Incorrect guess. Try again : " + "Computer Number: "+ randomNumber);
            takeUserInput();
        }


    }

    // Method to check if the number entered by the user is correct
    private boolean isCorrectNumber(int number) {
        return number == this.randomNumber;
    }

    public static void main(String[] args) {
        querySolve3Oops game = new querySolve3Oops();
        game.takeUserInput();
    }
}





