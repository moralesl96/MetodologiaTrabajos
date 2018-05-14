package com.company;

import java.util.Vector;

public class Company {
    private Vector<Department> vectordepartment= new Vector<Department>();
    public Company(){
        System.out.println("A company has been created");
    }
    public void setDepartment(Department department){
        vectordepartment.add(department);
    }
}
