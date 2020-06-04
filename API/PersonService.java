package API;

import Contract.Insurance;
import Person.*;

import java.util.ArrayList;

public class PersonService {

    public Person addPers(int ID, String name, String surname, String IN, String email, Address homeAddress, ArrayList<Person> listOfAllPersons){
        Person person = new Person(ID, name, surname, IN, email, homeAddress);
        listOfAllPersons.add(person);
        return person;
    }

    //ak je korespondencna adresa ina ako trvaly pobyt
    public Person addPers(int ID, String name, String surname, String IN, String email, Address homeAddress, Address corrAddress,  ArrayList<Person> listOfAllPersons){
        Person person = new Person(ID, name, surname, IN, email, homeAddress, corrAddress);
        listOfAllPersons.add(person);
        return person;
    }

    public Insurer addInsurer(int ID, String name, String surname, String IN, String email, Address homeAddress, ArrayList<Person> listOfAllPersons, ArrayList<Insurer> listOfAllInsurers){
        Insurer insurer = new Insurer(ID, name, surname, IN, email, homeAddress);
        listOfAllPersons.add(insurer);
        listOfAllInsurers.add(insurer);
        return insurer;
    }

    //ak je korespondencna adresa ina ako trvaly pobyt
    public Insurer addInsurer(int ID, String name, String surname, String IN, String email, Address homeAddress, Address corrAddress,  ArrayList<Person> listOfAllPersons, ArrayList<Insurer> listOfAllInsurers){
        Insurer insurer = new Insurer(ID, name, surname, IN, email, homeAddress, corrAddress);
        listOfAllPersons.add(insurer);
        listOfAllInsurers.add(insurer);
        return insurer;
    }

    public Person modifyPersName(Person person, String name){
        person.setName(name);
        return person;
    }

    public Person modifyPersSurame(Person person, String surname){
        person.setSurname(surname);
        return person;
    }

    public Person modifyPersIN(Person person, String IN){
        person.setIN(IN);
        return person;
    }

    public Person modifyPersEmail(Person person, String email){
        person.setEmail(email);
        return person;
    }

    public Person modifyPersHomeAddress(Person person, Address address){
        person.setHomeAddress(address);
        return person;
    }

    public Person modifyPersCorrAddress(Person person, Address address){
        person.setCorrAddress(address);
        return person;
    }

    public Person changePersListOfOwnInsurances(Person person, ArrayList<Insurance> listOfOwnInsurances){
        person.setListOfOwnInsurances(listOfOwnInsurances);
        return person;
    }

    public Insurer changeInsurersListOfMadeInsurances(Insurer insurer, ArrayList<Insurance> listOfMadeInsurances){
        insurer.setListOfMadeInsurances(listOfMadeInsurances);
        return insurer;
    }

    public void printAllPers(ArrayList<Person> listOfPersons){
        for (int i = 0; i < listOfPersons.size(); i++)
                System.out.println(listOfPersons.get(i).toString());
    }

    public void printPersByID(ArrayList<Person> listOfPersons, int ID){
        for (int i = 0; i < listOfPersons.size(); i++) {
            if(listOfPersons.get(i).getID() == ID)
                System.out.println(listOfPersons.get(i).toString());
        }
    }

}


