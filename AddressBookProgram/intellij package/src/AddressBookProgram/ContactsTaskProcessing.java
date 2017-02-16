package AddressBookProgram;

import java.util.List;
import java.util.Scanner;

import static AddressBookProgram.GenerateContact.contacts;
import static dayTwo.models.GeneratedEmployees.employees;

/**
 * Created by student on 14/02/2017.
 */

public class ContactsTaskProcessing {

    static Scanner input = new Scanner(System.in);

    public static void listAllContacts(){
        for(Contact c : contacts)
        {
            System.out.println(c);
        }
    }


    public static String createNew(List<String> data){
        try{
        Contact tempContact = new Contact(Integer.parseInt(data.get(0)), //ID
                data.get(1), //Email
                data.get(2), //Phone Number
                new Person(data.get(3), data.get(4)), //Person First and last name
                new Address(Integer.parseInt(data.get(4)), data.get(5), data.get(6))); //Address

        contacts.add(tempContact);

        return "Successfully added " + tempContact.getPerson().getFirstName();

    }catch (Exception e){
        return "Failure caused by: " + e;
    }

    }

    public static String searchByFirstName(String fn){
        String result = "";
        for(int i=0; i<contacts.size(); i++) {
            //compare- to items in contacts
            if (contacts.get(i).getPerson().getFirstName().equalsIgnoreCase(fn)) {
                result += String.format("{%s} %s", i, contacts.get(i).toString())  + "\n" ; //string.format is to use place holders (%s)
            }
        }
        if(result !="") {
            return result;
        }

        return "NOT FOUND!";}

}
