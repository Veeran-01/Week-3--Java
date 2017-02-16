package AddressBookProgram;


/**
 * Created by student on 14/02/2017.
 */
public class Contact {
    private int id;
    private String email;
    private String phoneNumber;
    private Person person;
    private Address address;


    //getter and setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    public Person getPerson() {return person;}
    public void setPerson(Person person) {this.person = person;}
    public Address getAddress() {return address;}
    public void setAddress(Address address) {this.address = address;}


    //constructor
    public Contact(int id, String email, String phoneNumber, Person person, Address address) {
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.person = person;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Person=" + person +
                ", Address=" + address +
                '}';
    }
}
