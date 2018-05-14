package com.company;

public class Department {
    private String Name;
    private Person person;
    private Company company;

    public Department(String name){
        this.Name=name;
        System.out.println("A Department Has been created");
    }
    public void setPerson(Person person)
    {
        this.person=person;
    }

    public void setCompany(Company company){
        this.company=company;
    }
}
