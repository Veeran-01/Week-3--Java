import java.util.Scanner;
/**
 * Created by veeran on 13/02/2017.
 */
public class DayOneExercises {
    public static void main(String[] args)
    {
        int[] test ={2, 4, 3, 1};

        System.out.println(numberOfEvens(test));



       /* 4. Given an array of ints length 3, figure out which is larger between the first and last elements in the array,
        and set all the other elements to be that value. Return the changed array.*/

    }

    public static String compareElements(int[] numbers)
    {
        if (numbers[0]> numbers[numbers.length-1] || numbers[0]==numbers[numbers.length-1])
        {

            for(int i=1; i<numbers.length; i++)
            {

                int firstNumber= numbers[0];
                numbers[i]= firstNumber;
                System.out.println(numbers[i]);
            }
        }
        else
        {

            for(int i=1; i<numbers.length; i++)
            {
                int lastNumber= numbers[numbers.length-1];
                numbers[i]= lastNumber;
                System.out.println(numbers[i]);
            }
        }

        return "";

    }

    /* 5. Given an int array length 2, return true if it contains a 2 or a 3.*/

    public static boolean containTwoOrThree(int[] numbers)
    {
        if (numbers[0] == 2  || numbers[1] == 2)
        {
            return true;
        }
        else if(numbers[0]==3 || numbers[1]==3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

  /*  6.Return the number of even ints in the given array. Note: the % “mod” operator computes the remainder,
    e.g. 5 % 2 is 1.
*/

  public static int numberOfEvens(int[] numbers)
  {
      int numberOfEven=0;
      for(int i=0; i<numbers.length; i++)
      {
          if ((numbers[i]) % 2 == 0)
          {
              numberOfEven += 1;
          }
          else
          {
              numberOfEven += 0;
          }
      }

      return numberOfEven;
  }



    /* 7. bigDiff- Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
     Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.*/

    /*public static int bigDiff(int[] numbers)
    {
        for(int i=0; i<numbers.length; i++)
        {
            for(int j=numbers.length; j>=0; j--)
            {
                int max = Math.max(numbers[i], numbers[j]);

                int min = Math.min(numbers[i], numbers[j]);

                int[] maxNumbers= new int[]{};
                int[] minNumbers=new int[]{};

                maxNumbers[i]= max;
                minNumbers[i]= min;
            }
        }
    }*/

}