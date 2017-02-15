package AddressBookProgram;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 14/02/2017.
 */
public class GenerateContact {

    //store contacts temporarily in list
    public static List<Contact> contacts = new ArrayList<>();

    public static void createContact(){

        Contact con1 = new Contact(1, "veeran-01@hotmail.co.uk", "07947397735",
                new Person("Veeran", "Shergill"), new Address(42, "Shelley Avenue", "E12 6SW"));

        contacts.add(con1);

    }

}
