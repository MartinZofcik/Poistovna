package Contract;

import Contract.Enums.TypeOfProperty;
import Person.Address;
import Person.Person;

import java.util.Date;

public class FlatHouseInsurance extends NonLifeInsurance{
    private boolean garageInsurance;

    public FlatHouseInsurance(int ID, Date dateOfConclusion, Person insurer, Date startOfInsurance, Date endOfInsurance, double maxSumOfInsurance, double monthlyPayment, TypeOfProperty typeOfProperty, Address addressOfProperty, double valueOfProperty, boolean garageInsurance) {
        super(ID, dateOfConclusion, insurer, startOfInsurance, endOfInsurance, maxSumOfInsurance, monthlyPayment, typeOfProperty, addressOfProperty, valueOfProperty);
        this.garageInsurance = garageInsurance;
    }

    public boolean isGarageInsurance() {
        return garageInsurance;
    }

    public void setGarageInsurance(boolean garageInsurance) {
        this.garageInsurance = garageInsurance;
    }
}
