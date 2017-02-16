package dayOne;
//want to use scanner class inside package called util inside package java
import sun.java2d.pipe.BufferedRenderPipe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by student on 13/02/2017.
 */
public class BasicInputOutput {
    public static void main(String[] args){
        System.out.println("Enter user input");
        //Getting user input string
        Scanner input = new Scanner(System.in);

        //Read the line and return the value to result string object
        System.out.println("Using scanner: " + input.nextLine());

        //Second method
        //BufferReader instead of scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Need to declare variable outside try block so can see it
        String result2="";

        try{
             result2 = br.readLine();
        }catch (IOException e){
            //display error
            e.printStackTrace();
        }
        System.out.println("Using bufferedReader: " + result2);



    }



}
