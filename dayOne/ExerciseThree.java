package dayOne;
import java.util.Scanner;

/**
 * Created by student on 13/02/2017.
 */

public class ExerciseThree {
    public static void main(String[] args)
    {
        System.out.println("What size ice cream would you like? Enter 1 for small, 2 for medium, 3 for large, and 4 for huge.");

        Scanner input = new Scanner(System.in);

        /* .nextLine() for string and .nextInt() for integer */

        int result = input.nextInt();

        switch (result)
        {
            case 1:
                System.out.println("You ordered a small that will cost £1.25");
                break;
            case 2:
                System.out.println("You ordered a medium that will cost £2.25");
                break;
            case 3:
                System.out.println("You ordered a large that will cost £3.25");
                break;
            case 4:
                System.out.println("You ordered a huge that will cost £4.00");
                break;
            default:
                System.out.println("That is not a valid entry");
                break;
        }





    }
}
