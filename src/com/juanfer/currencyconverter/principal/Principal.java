package com.juanfer.currencyconverter.principal;

import com.juanfer.currencyconverter.services.AskCurrencyPair;
import com.juanfer.currencyconverter.services.ConvertirMoneda;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        ConvertirMoneda conv = new ConvertirMoneda();
        int opcion;
        double valorIni;

        while (true) {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        "***************************************\n" +
                                "Bienvenido(a) al conversor de moneda\n\n" +
                                "1. Dolar =>> Peso argentino\n" +
                                "2. Peso argentino =>> Dólar\n" +
                                "3. Dólar =>> Real brasilero\n" +
                                "4. Rel brasilero =>> Dólar\n" +
                                "5. Dólar =>> Peso Colombiano\n" +
                                "6. Peso colombiano =>> Dólar\n" +
                                "7. Salir\n"
                ));
            } catch (Exception e) {
                System.out.println("Finalizando la app");
                break;
            }

            if (opcion < 1 | opcion > 6) {
                System.out.println("Finalizando la app");
                break;
            }

            try {
                valorIni = Double.parseDouble(JOptionPane.showInputDialog(
                        "***************************************\n" +
                                "Ingrese el valor a convertir"
                ));
            } catch (Exception e) {
                System.out.println("Finalizando la app");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println(conv.convertir("USD","ARS", valorIni));
                    break;
                case 2:
                    System.out.println(conv.convertir("ARS","USD", valorIni));
                    break;
                case 3:
                    System.out.println(conv.convertir("USD","BRL", valorIni));
                    break;
                case 4:
                    System.out.println(conv.convertir("BRL","USD", valorIni));
                    break;
                case 5:
                    System.out.println(conv.convertir("USD","COP", valorIni));
                    break;
                case 6:
                    System.out.println(conv.convertir("COP", "USD", valorIni));
                    break;
                default:
                    break;
            }
        }
    }
}
