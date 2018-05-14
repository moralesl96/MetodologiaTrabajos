package com.company;

import java.util.Vector;

public class Person {
    private String Name;
    private String EmployeeID;
    private String Title;
    private contactinformation Contactinfo;
    private Vector<Department> vectordepartment = new Vector<Department>();

    public Person(String name, String eid, String t) {
        this.Name = name;
        this.EmployeeID = eid;
        this.Title = t;
        System.out.println("A person has been created");
    }
    public void setContactinfo(contactinformation contactinfo){
        this.Contactinfo=contactinfo;
    }

    public void setDepartment (Department department){
        vectordepartment.add(department);
    }
}
