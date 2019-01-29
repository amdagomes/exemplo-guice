package com.guice.service;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.guice.impl.Boleto;
import com.guice.impl.CartaoCredito;
import com.guice.interfaces.FormaPagamento;

/**
 *
 * @author Amand
 */
public class PagamentoService extends AbstractModule{

    @Override
    protected void configure() {
        bind(FormaPagamento.class).to(Boleto.class);
//        bind(FormaPagamento.class).annotatedWith(Names.named("Boleto")).to(Boleto.class);
        bind(FormaPagamento.class).annotatedWith(Names.named("Credito")).to(CartaoCredito.class);
    }
    
}
