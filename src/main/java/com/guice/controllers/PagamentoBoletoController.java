package com.guice.controllers;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.guice.interfaces.FormaPagamento;

/**
 *
 * @author Amand
 */
public class PagamentoBoletoController {
    private FormaPagamento formaPagamento;
    
    @Inject
    public PagamentoBoletoController(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public void pagar(){
        formaPagamento.pagar();
    }
}
