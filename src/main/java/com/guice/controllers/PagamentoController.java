package com.guice.controllers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.guice.interfaces.FormaPagamento;

/**
 *
 * @author Amand
 */
@Singleton
public class PagamentoController {
    
    private FormaPagamento formaPagamento;
    
    @Inject
    public PagamentoController(@Named("Credito") FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public void pagar(){
        formaPagamento.pagar();
    }
}
