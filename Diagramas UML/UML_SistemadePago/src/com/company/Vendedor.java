package com.company;

import java.util.Vector;

public class Vendedor {
    private  Vector<Cliente_Corporativo> vectorcc = new Vector();
    private Sistema_de_Pago sistema_de_pago;

    public Vendedor(){
        System.out.println("Se creo un vendedor");
    }

    public int ConsultarDesdeVendedor(Sistema_de_Pago sp){
        return sp.ConsultarSaldo();
    }
}
