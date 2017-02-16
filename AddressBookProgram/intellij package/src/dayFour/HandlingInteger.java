package dayFour;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by student on 16/02/2017.
 */
public class HandlingInteger {
    public static void main(String[]args){

        System.out.println("Enter a number between 1 and 10: ");

        while (true){
            try{
                Scanner input = new Scanner(System.in);

                int yourNumber = input.nextInt();

                if(yourNumber<1 || yourNumber>10)
                    throw new Exception("Number must be between 1 and 10");     //throw new exception

                System.out.println("Your number is valid your number is " + yourNumber);
                break;  //to exit infinite loop once they entered a valid number
            //multiple catch
            }catch(InputMismatchException inputMis){        //if they type in a character
                System.out.println("Please put in a number");
            }
            catch(Exception e){      //generic exception
                e.printStackTrace();    //doesn't show just the message- shows line number as well
            } finally {
                System.out.println("Thank you for playing"); //Always executes
            }
        }




    }
}
