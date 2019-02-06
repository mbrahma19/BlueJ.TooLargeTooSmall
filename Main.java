import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Main here.
 *
 * @author (Marshilla Brahma)
 * @version (2/5/2019)
 */
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        x = 0;
    }
    
   
    public static void main(String[] args ){
        boolean correct = false;
        int counter = 0;
        
        Random rand = new Random();
        int x = rand.nextInt(10);
        
        System.out.println("Try to guess the Mystery number! The range is 0 - 10");
        
        //System.out.println("Random Number" + x);
        
        Scanner userInput = new Scanner(System.in);
        int userGuess = -1;
        while(correct == false){
            int prevGuess = userGuess;
            userGuess = userInput.nextInt();
            if(userGuess != x){
                counter = (prevGuess == userGuess) ? counter: (counter + 1);
                if(userGuess>x){
                    System.out.println("Too high, guess again");  
                }
                else{
                    System.out.println("Too low, guess again");
                }
            }
            else{
                System.out.printf("You got the correct answer! It was %d. Number of guesses: %d", x, counter);
                correct = true;
            }

        }  

    }
}
