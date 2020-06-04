package Contract;

import Person.Person;

import java.util.Date;

public abstract class Insurance {

    private int ID;
    private Date dateOfConclusion;
    private Person insurer;
    private Date startOfInsurance;
    private Date endOfInsurance;
    private double maxSumOfInsurance;
    private double monthlyPayment;

    public Insurance() {
    }

    public Insurance(int ID, Date dateOfConclusion, Person insurer, Date startOfInsurance, Date endOfInsurance, double maxSumOfInsurance, double monthlyPayment) {
        this.ID = ID;
        this.dateOfConclusion = dateOfConclusion;
        this.insurer = insurer;
        this.startOfInsurance = startOfInsurance;
        this.endOfInsurance = endOfInsurance;
        this.maxSumOfInsurance = maxSumOfInsurance;
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public String toString() {
        return  "ID= " + ID + " dateOfConclusion= " + dateOfConclusion + " insurer= " + insurer + " startOfInsurance= " + startOfInsurance +
                " endOfInsurance= " + endOfInsurance + " maxSumOfInsurance= " + maxSumOfInsurance + " monthlyPayment= " + monthlyPayment;
    }

    public int getID() {return ID; }

    public Date getDateOfConclusion() {
        return dateOfConclusion;
    }

    public void setDateOfConclusion(Date dateOfConclusion) {
        this.dateOfConclusion = dateOfConclusion;
    }

    public Person getInsurer() {
        return insurer;
    }

    public void setInsurer(Person insurer) {
        this.insurer = insurer;
    }

    public Date getStartOfInsurance() {
        return startOfInsurance;
    }

    public void setStartOfInsurance(Date startOfInsurance) {
        this.startOfInsurance = startOfInsurance;
    }

    public Date getEndOfInsurance() {
        return endOfInsurance;
    }

    public void setEndOfInsurance(Date endOfInsurance) {
        this.endOfInsurance = endOfInsurance;
    }

    public double getMaxSumOfInsurance() {
        return maxSumOfInsurance;
    }

    public void setMaxSumOfInsurance(double maxSumOfInsurance) {
        this.maxSumOfInsurance = maxSumOfInsurance;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}
