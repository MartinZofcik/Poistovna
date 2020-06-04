package Contract;

import Contract.Enums.PurposeOfTrip;
import Person.Person;

import java.util.Date;

public class TravelInsurance extends Insurance{

    private Person insured;
    private boolean inEU; //true ak je v EU
    private PurposeOfTrip purpose;

    public TravelInsurance(int ID, Date dateOfConclusion, Person insurer, Date startOfInsurance, Date endOfInsurance, double maxSumOfInsurance, double monthlyPayment, Person insured, boolean inEU, PurposeOfTrip purpose) {
        super(ID, dateOfConclusion, insurer, startOfInsurance, endOfInsurance, maxSumOfInsurance, monthlyPayment);
        this.insured = insured;
        this.inEU = inEU;
        this.purpose = purpose;
    }

    public Person getInsured() {
        return insured;
    }

    public void setInsured(Person insured) {
        this.insured = insured;
    }

    public boolean isInEU() {
        return inEU;
    }

    public void setInEU(boolean inEU) {
        this.inEU = inEU;
    }

    public PurposeOfTrip getPurpose() {
        return purpose;
    }

    public void setPurpose(PurposeOfTrip purpose) {
        this.purpose = purpose;
    }
}
