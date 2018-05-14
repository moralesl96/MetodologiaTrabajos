package com.company;

import java.util.Vector;

public class Pedido {
    private Cliente cliente;
    private Vector vectorlp;


    public Pedido(){
        System.out.println("Se ha creado un Pedido");
        Vector<Linea_Pedido> vectorlp= new Vector();
    }
}
