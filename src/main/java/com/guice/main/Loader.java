package com.guice.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.controllers.PagamentoBoletoController;
import com.guice.controllers.PagamentoController;
import com.guice.interfaces.FormaPagamento;
import com.guice.service.PagamentoService;

/**
 *
 * @author Amand
 */
public class Loader {
    public static void main(String[] args) {
        
//        Injector inject = Guice.createInjector();
//        
//        PagamentoController pagamento = inject.getInstance(PagamentoController.class);
//        pagamento.pagar();
        
        Injector injector = Guice.createInjector(new PagamentoService());
        PagamentoController pagamento = injector.getInstance(PagamentoController.class);
        pagamento.pagar();
        PagamentoController pagamento2 = injector.getInstance(PagamentoController.class);
        pagamento.pagar();
        PagamentoBoletoController pagamentoBoleto = injector.getInstance(PagamentoBoletoController.class);
        pagamentoBoleto.pagar();

        System.out.println(pagamento);
        System.out.println(pagamento2);
    }
}
