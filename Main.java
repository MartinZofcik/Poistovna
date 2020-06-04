import API.InsuranceService;
import API.PersonService;
import Contract.Insurance;
import Contract.Enums.PurposeOfTrip;
import Contract.Enums.Region;
import Person.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {             // Žofčík Martin, 98034

    public static void main(String[] args) {

        InsuranceService insServ = new InsuranceService();
        PersonService persServ = new PersonService();

        ArrayList<Insurance> allContracts = new ArrayList<Insurance>();
        ArrayList<Person> allPerson = new ArrayList<Person>();
        ArrayList<Insurer> allInsurers = new ArrayList<Insurer>();

        Date date1 = new Date(2020, 10, 20);
        Date date2 = new Date(2019, 1, 25);

        Address addr1 = new Address("01234","Bratislava","Hurbanova", 37);
        Address addr2 = new Address("54321","Kosice","Jebalova", 6);

        persServ.addPers(1, "Peter", "Jakubík", "990202/3698", "peto.jakubik@gmail.com", addr1, allPerson);
        persServ.addInsurer(2, "Jakub", "Peterík", "850230/3812", "kubo.petrik@gmail.com", addr1, allPerson, allInsurers);
        persServ.addInsurer(3, "Jano", "Peter", "85022", "kubtrik@gmail.com", addr1, allPerson, allInsurers);

        insServ.addTravelInsurance(allPerson.get(0), 1, date2, allInsurers.get(0), date2, date1, 10000, 100, true, PurposeOfTrip.SPORT, allContracts);
        insServ.addAccidentInsurance(allPerson.get(0), 2, date1, allInsurers.get(0), date2, date1, 10, 10,10, 10000, 100, Region.SLOVAKIAWORLD, allContracts);

//        insServ.printAllContracts(allPerson.get(0).getListOfOwnInsurances());
//        insServ.changeMonthlyPayment(allPerson.get(0).getListOfOwnInsurances().get(0), 22222);
//        System.out.println();
//        insServ.printAllContracts(allPerson.get(0).getListOfOwnInsurances());
//        insServ.printAllContractsByInsurersID(allContracts, allInsurers.get(0));


//        persServ.printAllPers(allPerson);
//        persServ.modifyPersName(allPerson.get(0), "AAAAAAAAA");
//        System.out.println();
//        persServ.printAllPers(allPerson);
    }
}
