package Person;

import Contract.Insurance;
import java.util.ArrayList;

public class Person{

    private int ID;
    private String name;
    private String surname;
    private String IN;   //rodne cislo
    private String email;
    private Address homeAddress;
    private Address corrAddress;
    private ArrayList<Insurance> listOfOwnInsurances = new ArrayList<Insurance>();

    public Person(int ID, String name, String surname, String IN, String email, Address homeAddress) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.IN = IN;
        this.email = email;
        this.homeAddress = homeAddress;
        this.corrAddress = homeAddress;
    }

    //ak je korespondencna adresa ina ako trvaly pobyt
    public Person(int ID, String name, String surname, String IN, String email, Address homeAddress, Address corrAddress) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.IN = IN;
        this.email = email;
        this.homeAddress = homeAddress;
        this.corrAddress = corrAddress;
    }

    @Override
    public String toString() {
        return  "ID= " + ID + ' ' + "name= " + name + ' ' +  "surname= " + surname + ' ' +
                "IN= " + IN + ' ' + "email= " + email;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIN() {
        return IN;
    }

    public void setIN(String IN) {
        this.IN = IN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getCorrAddress() {
        return corrAddress;
    }

    public void setCorrAddress(Address corrAddress) {
        this.corrAddress = corrAddress;
    }

    public ArrayList<Insurance> getListOfOwnInsurances() {
        return listOfOwnInsurances;
    }

    public void setListOfOwnInsurances(ArrayList<Insurance> listOfOwnInsurances) {
        this.listOfOwnInsurances = listOfOwnInsurances;
    }


}
