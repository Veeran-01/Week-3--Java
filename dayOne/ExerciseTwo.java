package dayOne;
import java.util.Scanner;


/**
 * Created by student on 13/02/2017.
 */
public class ExerciseTwo {
    public static void main(String [] args)
    {


        System.out.println("Please enter a character");

        Scanner input = new Scanner(System.in);

        //just read first CHARACTER
        char userInput = input.next().charAt(0);

        //Check is uppercase- using character class
        if ( Character.isUpperCase(userInput))
        {
            System.out.println("Your character is in Uppercase");
        }
        else if (Character.isLowerCase(userInput))
        {
            System.out.println("Your character is in Lowercase");
        }
        else if (Character.isDigit(userInput))
        {
            //use isDigit to check if its a digit
            System.out.println("Your character is a number");
        }
        else
        {
            System.out.println("Your character is not a character or a number");
        }




    }
}
