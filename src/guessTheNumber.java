import java.util.Random;
import java.util.Scanner;

class Game{
    public  int number;
    public  int inputNumber;
    public  int noOfGuesses = 0;
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }


     Game(){
        Random random = new Random();
        this.number =random.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber =sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == number){
            System.out.format("yes you guess the right %d\n you guesses it in %d attempts. ", number, noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low...");
        } else if (inputNumber > number) {
            System.out.println("Too high...");

        }
        return false;

    }
}
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
        Game game = new Game();
        boolean b = false;
        while (!b) {
            game.takeUserInput();
             b = game.isCorrectNumber();

        }
    }
}
