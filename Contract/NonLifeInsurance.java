package Contract;

import Contract.Enums.TypeOfProperty;
import Person.Address;
import Person.Person;

import java.util.Date;

public abstract class NonLifeInsurance extends Insurance {

    private TypeOfProperty typeOfProperty;
    private Address addressOfProperty;
    private double valueOfProperty;

    public NonLifeInsurance(int ID, Date dateOfConclusion, Person insurer, Date startOfInsurance, Date endOfInsurance, double maxSumOfInsurance, double monthlyPayment, TypeOfProperty typeOfProperty, Address addressOfProperty, double valueOfProperty) {
        super(ID, dateOfConclusion, insurer, startOfInsurance, endOfInsurance, maxSumOfInsurance, monthlyPayment);
        this.typeOfProperty = typeOfProperty;
        this.addressOfProperty = addressOfProperty;
        this.valueOfProperty = valueOfProperty;
    }

    public TypeOfProperty getTypeOfProperty() {
        return typeOfProperty;
    }

    public void setTypeOfProperty(TypeOfProperty typeOfProperty) {
        this.typeOfProperty = typeOfProperty;
    }

    public Address getAddressOfProperty() {
        return addressOfProperty;
    }

    public void setAddressOfProperty(Address addressOfProperty) {
        this.addressOfProperty = addressOfProperty;
    }

    public double getValueOfProperty() {
        return valueOfProperty;
    }

    public void setValueOfProperty(double valueOfProperty) {
        this.valueOfProperty = valueOfProperty;
    }
}
