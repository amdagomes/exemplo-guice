package com.guice.interfaces;

import com.google.inject.ImplementedBy;
import com.guice.impl.Boleto;

/**
 *
 * @author Amand
 */
//@ImplementedBy(Boleto.class)
public interface FormaPagamento {
    public void pagar();
}
