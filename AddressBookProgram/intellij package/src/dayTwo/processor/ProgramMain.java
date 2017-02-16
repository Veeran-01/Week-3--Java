package dayTwo.processor;

import dayTwo.gui.CommandInterface;
import dayTwo.models.Employee;
import dayTwo.models.GeneratedEmployees;

import static dayTwo.models.GeneratedEmployees.employees;

/**
 * Created by student on 14/02/2017.
 */
public class ProgramMain {
    public static void main(String[] args) {
        //Create temp employees collection
        //GeneratedEmployees.createEmployees();

        TaskProcessing.setUpDb();


        CommandInterface.display();





    }


}
