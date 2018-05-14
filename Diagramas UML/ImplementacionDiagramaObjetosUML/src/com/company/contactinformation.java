package com.company;

public class contactinformation {
    private Person person;
    private String address;
    public contactinformation(String ad){
        this.address= ad;
        System.out.println("A contact information has been created");
    }
    public void setPerson(Person person)
    {
        this.person=person;
    }
}
