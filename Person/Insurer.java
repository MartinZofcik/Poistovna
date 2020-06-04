package Person;

import Contract.Insurance;

import java.util.ArrayList;

public class Insurer extends Person {

    private ArrayList<Insurance> listOfMadeInsurances = new ArrayList<Insurance>();

    public Insurer(int ID, String name, String surname, String IN, String email, Address homeAddress) {
        super(ID, name, surname, IN, email, homeAddress);
    }

    public Insurer(int ID, String name, String surname, String IN, String email, Address homeAddress, Address corrAddress) {
        super(ID, name, surname, IN, email, homeAddress, corrAddress);
    }

    public ArrayList<Insurance> getListOfMadeInsurances() {
        return listOfMadeInsurances;
    }

    public void setListOfMadeInsurances(ArrayList<Insurance> listOfMadeInsurances) {
        this.listOfMadeInsurances = listOfMadeInsurances;
    }
}
