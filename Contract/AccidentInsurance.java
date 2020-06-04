package Contract;

import Contract.Enums.Region;
import Person.Person;

import java.util.Date;

public class AccidentInsurance extends  Insurance{

    private Person insured;
    private double sumPermCons;
    private double sumDeath;
    private double dailyComp;
    private Region region;

    public AccidentInsurance(int ID, Date dateOfConclusion, Person insurer, Date startOfInsurance, Date endOfInsurance, double maxSumOfInsurance, double monthlyPayment, Person insured, double sumPermCons, double sumDeath, double dailyComp, Region region) {
        super(ID, dateOfConclusion, insurer, startOfInsurance, endOfInsurance, maxSumOfInsurance, monthlyPayment);
        this.insured = insured;
        this.sumPermCons = sumPermCons;
        this.sumDeath = sumDeath;
        this.dailyComp = dailyComp;
        this.region = region;
    }

    public Person getInsured() {
        return insured;
    }

    public void setInsured(Person insured) {
        this.insured = insured;
    }

    public double getSumPermCons() {
        return sumPermCons;
    }

    public void setSumPermCons(double sumPermCons) {
        this.sumPermCons = sumPermCons;
    }

    public double getSumDeath() {
        return sumDeath;
    }

    public void setSumDeath(double sumDeath) {
        this.sumDeath = sumDeath;
    }

    public double getDailyComp() {
        return dailyComp;
    }

    public void setDailyComp(double dailyComp) {
        this.dailyComp = dailyComp;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}

