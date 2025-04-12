package com.juanfer.currencyconverter.services;

import java.text.DecimalFormat;

public class ConvertirMoneda {
    public String convertir(String base, String target, double valor) {
        DecimalFormat formato = new DecimalFormat("###,###.##");
        AskCurrencyPair par = new AskCurrencyPair();
        return "El valor de " + formato.format(valor) + " [" + base + "] " +
                "corresponde al valor final de =>>> " + formato.format(valor * par.consultarPar(base, target)) +
                " [" + target + "]";
    }
}
