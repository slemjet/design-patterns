package model.builders.faceted;

import model.Person;

public class PersonJobBuilder extends PersonBuilderFaceted {

    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder companyName(String companyName) {
        person.setCompanyName(companyName);
        return this;
    }

    public PersonJobBuilder position(String position) {
        person.setPosition(position);
        return this;
    }

    public PersonJobBuilder annualIncome(int annualIncome) {
        person.setAnnualIncome(annualIncome);
        return this;
    }
}
