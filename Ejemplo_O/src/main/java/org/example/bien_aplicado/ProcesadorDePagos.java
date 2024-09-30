package org.example.bien_aplicado;

public class ProcesadorDePagos {
    public void procesar( MetodoDePago metodoDePago, double cantidad) {
        metodoDePago.procesarPago(cantidad);
    }
}
