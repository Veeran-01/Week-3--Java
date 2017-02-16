package dayFour;

/**
 * Created by student on 16/02/2017.
 */
public class dayTest {
    public static void main(String[] args){
        DaysOfTheWeek thisDay = DaysOfTheWeek.MONDAY;        //reference to the constants created in enum class

        System.out.println(thisDay);

        //can change value of variable thisDay
        thisDay = DaysOfTheWeek.FRIDAY;

        System.out.println("The day of the week is " + thisDay + " and it is the day " + thisDay.getDay()+"  of the week.");


        //get all constant objects
        DaysOfTheWeek days[] = DaysOfTheWeek.values();
        for (DaysOfTheWeek d : days)
            System.out.println(d);
}}
