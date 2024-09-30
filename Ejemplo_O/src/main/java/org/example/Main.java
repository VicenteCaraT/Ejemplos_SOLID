package org.example;

import org.example.bien_aplicado.*;

public class Main {
    public static void main(String[] args) {
        ProcesadorDePagos procesador = new ProcesadorDePagos();

        // Pago con tarjeta de crédito
        MetodoDePago pagoConTarjeta = new PagoTarjetaCredito();
        procesador.procesar(pagoConTarjeta, 100.0);

        // Pago con PayPal
        MetodoDePago pagoConPayPal = new PagoPayPal();
        procesador.procesar(pagoConPayPal, 200.0);

        // Pago con transferencia bancaria
        MetodoDePago pagoConTransferencia = new PagoTransferenciaBancaria();
        procesador.procesar(pagoConTransferencia, 300.0);
    }
}