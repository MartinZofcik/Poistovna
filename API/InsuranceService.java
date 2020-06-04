package API;

import Contract.*;
import Contract.Enums.PurposeOfTrip;
import Contract.Enums.Region;
import Contract.Enums.TypeOfProperty;
import Person.*;

import java.util.ArrayList;
import java.util.Date;

public class InsuranceService {

    public TravelInsurance addTravelInsurance(Person insured, int ID, Date dateOfConclusion, Insurer insurer, Date startOfInsurance, Date endOfInsurance, double maxSumOfInsurance, double monthlyPayment, boolean inEU, PurposeOfTrip purpose, ArrayList<Insurance> listOfAllContracts){
        TravelInsurance insurance = new TravelInsurance(ID, dateOfConclusion, insurer, startOfInsurance, endOfInsurance, maxSumOfInsurance, monthlyPayment, insured, inEU, purpose);
        insured.getListOfOwnInsurances().add(insurance);
        insurer.getListOfMadeInsurances().add(insurance);
        listOfAllContracts.add(insurance);
        return insurance;
    }

    public AccidentInsurance addAccidentInsurance(Person insured, int ID, Date dateOfConclusion, Insurer insurer, Date startOfInsurance, Date endOfInsurance, double maxSumOfInsurance, double monthlyPayment, double sumPermCons, double sumDeath, double dailyComp, Region region, ArrayList<Insurance> listOfAllContracts) {
        AccidentInsurance insurance = new AccidentInsurance(ID, dateOfConclusion, insurer, startOfInsurance, endOfInsurance, maxSumOfInsurance, monthlyPayment, insured, sumPermCons, sumDeath, dailyComp, region);
        insured.getListOfOwnInsurances().add(insurance);
        insurer.getListOfMadeInsurances().add(insurance);
        listOfAllContracts.add(insurance);
        return insurance;
    }

    public HouseholdInsurance addHouseholdInsurance(int ID, Date dateOfConclusion, Insurer insurer, Date startOfInsurance, Date endOfInsurance, double maxSumOfInsurance, double monthlyPayment, TypeOfProperty typeOfProperty, Address addressOfProperty, double valueOfProperty, double valueOfEquipment, ArrayList<Insurance> listOfAllContracts) {
        HouseholdInsurance insurance = new HouseholdInsurance(ID, dateOfConclusion, insurer, startOfInsurance, endOfInsurance, maxSumOfInsurance, monthlyPayment, typeOfProperty, addressOfProperty, valueOfProperty, valueOfEquipment);
        insurer.getListOfMadeInsurances().add(insurance);
        listOfAllContracts.add(insurance);
        return insurance;
    }

    public FlatHouseInsurance addFlatHouseInsurance(int ID, Date dateOfConclusion, Insurer insurer, Date startOfInsurance, Date endOfInsurance, double maxSumOfInsurance, double monthlyPayment, TypeOfProperty typeOfProperty, Address addressOfProperty, double valueOfProperty, boolean garageInsurance, ArrayList<Insurance> listOfAllContracts) {
        FlatHouseInsurance insurance = new FlatHouseInsurance(ID, dateOfConclusion, insurer, startOfInsurance, endOfInsurance, maxSumOfInsurance, monthlyPayment, typeOfProperty, addressOfProperty, valueOfProperty, garageInsurance);
        insurer.getListOfMadeInsurances().add(insurance);
        listOfAllContracts.add(insurance);
        return insurance;
    }

    public Insurance changeDateOfConclusion(Insurance insurance, Date date){
        insurance.setDateOfConclusion(date);
        return insurance;
    }

    public Insurance changeMonthlyPayment(Insurance insurance, double sum){
        insurance.setMonthlyPayment(sum);
        return insurance;
    }

    public Insurance changeMyInsurer(Insurance insurance, Insurer insurer){
        insurance.setInsurer(insurer);
        return insurance;
    }

    public void printAllContracts(ArrayList<Insurance> listOfInsurances){
        for (int i = 0 ; i < listOfInsurances.size(); i++){
            System.out.println(listOfInsurances.get(i).toString());
        }
    }

    public void printAllContractsByInsurersID(ArrayList<Insurance> listOfInsurances, Insurer insurer){
        for (int i = 0 ; i < listOfInsurances.size(); i++){
            if(insurer.getID() == listOfInsurances.get(i).getInsurer().getID())
                System.out.println(listOfInsurances.get(i).toString());
        }
    }
}
