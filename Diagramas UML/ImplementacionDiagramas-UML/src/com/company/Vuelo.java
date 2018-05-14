package com.company;

import java.util.Vector;

public class Vuelo {
    private  Compania_aerea compania_aerea;
    private Avion avion;
    private Piloto pilotoArray[];
    private Vector reserva;
    public Vuelo(){
        System.out.println("Se creo un Vuelo");
        Piloto pilotoArray[]= new Piloto[2];
        Vector<Reserva> reserva= new Vector();
    }
}
