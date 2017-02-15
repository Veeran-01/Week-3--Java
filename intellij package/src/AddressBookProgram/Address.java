package AddressBookProgram;

/**
 * Created by student on 14/02/2017.
 */
public class Address {
    private int doorNumber;
    private String streetName;
    private String postCode;

    //getter and setter
    public int getDoorNumber() {return doorNumber;}
    public void setDoorNumber(int doorNumber) {this.doorNumber = doorNumber;}
    public String getStreetName() {return streetName;}
    public void setStreetName(String streetName) {this.streetName = streetName;}
    public String getPostCode() {return postCode;}
    public void setPostCode(String postCode) {this.postCode = postCode;}

    //Constructor
    public Address(int doorNumber, String streetName, String postCode) {
        this.doorNumber = doorNumber;
        this.streetName = streetName;
        this.postCode = postCode;
    }

    //ToString
    @Override
    public String toString() {
        return "Address{" +
                "doorNumber=" + doorNumber +
                ", streetName='" + streetName + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
