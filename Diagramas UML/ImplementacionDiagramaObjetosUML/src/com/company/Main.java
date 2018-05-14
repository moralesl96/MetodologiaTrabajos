package com.company;

public class Main {

    public static void main(String[] args) {

        Company c= new Company();
        Department d1 = new Department("Sales");
        Department d2 = new Department("R & D");
        Department d3 = new Department("US SALES");
        Person p = new Person("Erin", "4362", "VIP of Sales");
        contactinformation ci = new contactinformation("1472 Miller St.");

        c.setDepartment(d1);
        c.setDepartment(d2);
        c.setDepartment(d3);

        d3.setCompany(c);
        d3.setPerson(p);

        p.setContactinfo(ci);
        p.setDepartment(d3);

        ci.setPerson(p);
    }
}
