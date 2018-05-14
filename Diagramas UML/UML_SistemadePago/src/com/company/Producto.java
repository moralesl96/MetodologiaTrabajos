package com.company;

import java.util.Vector;

public class Producto {
    private Vector<Linea_Pedido> vectorlp= new Vector();

    public Producto(){
        System.out.println("Se creo un producto");
    }
    public void Ver_Linea_pedido(Linea_Pedido linea_pedidos){
        vectorlp.add(linea_pedidos);
    }
}
