package dayTwo.models;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 14/02/2017.
 */
public class GeneratedEmployees {
    //List is always a sequence of objects stored with index- variable size unlike array
    public static List<Employee> employees = new ArrayList<>();

    public static void createEmployees(){
        Employee alex = new Employee(1, "Alex", "Kennedy", LocalDate.of(1983, 4,16), LocalDate.of(2017, 1, 1), "Trainer");
        Employee veeran = new Employee(2, "Veeran", "Shergill", LocalDate.of(1993, 8,26), LocalDate.of(2017, 1, 31), "Student");

        employees.add(alex); //index 0
        employees.add(veeran); // index 1
    }
}
