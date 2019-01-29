package com.guice.impl;

import com.guice.interfaces.FormaPagamento;

/**
 *
 * @author Amand
 */
public class CartaoCredito implements FormaPagamento{

    @Override
    public void pagar() {
        System.out.println("Pago com cartao de credito");
    }
    
}
