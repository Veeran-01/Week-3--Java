package dayOne;
import java.util.Scanner;

/**
 * Created by student on 13/02/2017.
 */
public class SwitchExercise {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input two numbers and one operator (+, -, * or /) with spaces in between: ");

        //Split string by space- and add to array so would have 3 members of array
        String[] result = input.nextLine().split(" ");
        System.out.println(compute(result));
    }

    static int compute(String[] result){
        //Convert first two members of array from strings into integers
        int op1 = Integer.parseInt(result[0]);
        int op2 = Integer.parseInt(result[1]);

        int outcome=0;
        switch (result[2])
        {
            case "+":
                outcome = op1 + op2;
                break;
            case "-":
                outcome = op1 - op2;
                break;
            case "*":
                outcome = op1 * op2;
                break;
            case "/":
                outcome = op1 / op2;
                break;
        }
        return outcome;


    }
}
