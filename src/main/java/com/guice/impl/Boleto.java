package com.guice.impl;

import com.google.inject.name.Named;
import com.guice.interfaces.FormaPagamento;

/**
 *
 * @author Amand
 */
public class Boleto implements FormaPagamento{

    @Override
    public void pagar() {
        System.out.println("Pago com boleto");
    }
    
}
