package com.company;
import java.util.Vector;

public class Avion {
    private Motor motorArray[];
    private Vector vuelo;

    public  Avion()
    {
        System.out.println("Se creo un avioncito");
        Motor motorArray[]= new Motor[4];
        Vector<Vuelo> vuelo = new Vector();

    }
}
