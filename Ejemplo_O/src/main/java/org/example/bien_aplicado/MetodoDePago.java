package org.example.bien_aplicado;

public interface MetodoDePago {
    void procesarPago(double cantidad);
    double calcularImpuestos(double cantidad);
}
