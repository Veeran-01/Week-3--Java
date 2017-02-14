package dayOne;
import java.lang.reflect.Array;
import java.util.Scanner;
/**
 * Created by student on 13/02/2017.
 */
public class ArrayExercise {
    public static void main(String[] args){
        int[] test ={3, 2, 13,  3};
       //int[] test2 ={6,2,3,4,5,6};


        System.out.println(sum13(test));



    }

    //1. Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
    static boolean firstLastSix(int[] nums)
    {
        return (nums[0]==6 || nums[nums.length-1]==6);
    }

    //2.Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are the same

    static boolean lengthIsOne(int[] nums)
    {
        return (nums.length>= 1 && nums[0]==nums[nums.length-1]);
    }

    //3.Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

    static boolean twoArrays(int[] a, int[] b)
    {
        if (a.length>0 && b.length>0) {
            return (a[0] == b[0] || b[b.length - 1] == a[a.length - 1]);
        }
        else{
            return false;
        }
    }

    //4. Given an array of ints length 3, figure out which is larger between the first and last elements in the array,
    // and set all the other elements to be that value. Return the changed array.

    static String lengthOFthree(int[] nums)
    {
        if (nums[0]> nums[nums.length-1])
        {
            for (int i : nums)
            {
                i= 1;
                int firstInt =nums[0];
                nums[i]=firstInt;
                System.out.println(nums[i]);
            }
        }
        else if (nums[0]< nums[nums.length-1])
        {
            for (int i : nums)
            {
                i= 1;
                int lastInt= nums[nums.length-1];
                nums[i]= lastInt;
                System.out.println(nums[i]);
            }
        }
        else
        {
            for (int i : nums)
            {
                i= 0;
                System.out.println(nums[i]);
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

   /* public static int bigDiff(int[] numbers)
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
    }
    */

   /*
    8. Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
    so it does not count and numbers that come immediately after a 13 also do not count
    */

   public static int sum13(int[] numbers){
       int sum=0;

       for( int i=0; i<numbers.length; i++) {
           if (numbers[i] != 13) {
               sum += numbers[i];
           } else {
               sum += 0;
               break;
           }
       }

       return sum;
   }

   /*
    Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to
    the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
    */

   public static int sum67(int[] numbers){
       int sum = 0;

       for(int i=0; i<numbers.length; i++)
       {
           if(numbers[i] !=6){
               sum +=numbers[i];
           }
           else
           {
               for (i=0; numbers[i]==7; i++)
               {
                   sum += 0;
               }
               break;

           }

       }
       return sum;
   }


}
