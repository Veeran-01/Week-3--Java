package AddressBookProgram;

import static AddressBookProgram.GenerateContact.contacts;

/**
 * Created by student on 14/02/2017.
 */
public class ProgramMain {

    public static void main(String[] args){

        GenerateContact.createContact();

        //To display options
        ContactInterface.display();


    }
}
