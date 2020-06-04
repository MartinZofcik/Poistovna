package Contract;

import Contract.Enums.TypeOfProperty;
import Person.Address;
import Person.Person;

import java.util.Date;

public class HouseholdInsurance extends NonLifeInsurance {

    private double valueOfEquipment;

    public HouseholdInsurance(int ID, Date dateOfConclusion, Person insurer, Date startOfInsurance, Date endOfInsurance, double maxSumOfInsurance, double monthlyPayment, TypeOfProperty typeOfProperty, Address addressOfProperty, double valueOfProperty, double valueOfEquipment) {
        super(ID, dateOfConclusion, insurer, startOfInsurance, endOfInsurance, maxSumOfInsurance, monthlyPayment, typeOfProperty, addressOfProperty, valueOfProperty);
        this.valueOfEquipment = valueOfEquipment;
    }

    public double getValueOfEquipment() {
        return valueOfEquipment;
    }

    public void setValueOfEquipment(double valueOfEquipment) {
        this.valueOfEquipment = valueOfEquipment;
    }
}
