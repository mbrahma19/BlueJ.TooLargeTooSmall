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
        int counter = 1;
        
        System.out.println("Try to guess the Mystery number! The range is 0 - 10");
        
        Scanner userInput = new Scanner(System.in);
        int username = userInput.nextInt();
        
        Random rand = new Random();
        int x = rand.nextInt(10);
        
        while(correct == false){
            if(username != x){
                if(username>x){
                    System.out.println("Too high, guess again");
                    username = userInput.nextInt();
                    counter++;
                    System.out.println("Number of guesses: " + counter);
                }
                else{
                    System.out.println("Too low, guess again");
                    username = userInput.nextInt();
                    counter++;
                    System.out.println("Number of guesses: " + counter);
                }
            }
            else{
                System.out.println("You got the correct answer! It was " + x);
                System.out.println("Number of guesses: " + counter);
                correct = true;
            }

        }  


    }
}
