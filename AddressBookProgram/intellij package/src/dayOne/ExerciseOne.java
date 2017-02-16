package dayOne;
import java.util.Scanner;

/**
 * Created by student on 13/02/2017.
 */
public class ExerciseOne {
    public static void main(String[] args){

        //Ask for user input
        System.out.println("Please enter a number between 0-1000");

        Scanner input = new Scanner(System.in);

        //to read as an integer .nextInt
        int userInt = input.nextInt();

        if ( userInt <= 100)
        {
            System.out.println("Your number is less than or equal to 100");
        }
        else if (userInt <=500 && userInt>100)
        {
            System.out.println("Your number is less than or equal to 500");
        }
        else if (userInt <=1000)
        {
            System.out.println("Your number is less than or equal to 1000");
        }
        else
        {
            System.out.println("Your number is more than 1000 AND Your number is beyond our scope");
        }

    }
}

