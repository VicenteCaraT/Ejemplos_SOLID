package org.example.bien_aplicado;

public class PagoTarjetaCredito implements MetodoDePago{
    private static final double IMPUESTO_TARJETA_CREDITO = 0.02;
    @Override
    public void procesarPago(double cantidad) {
        double impuestos = calcularImpuestos(cantidad);
        double total = cantidad + impuestos;
        System.out.println("Procesando pago con tarjeta de crédito: $" + total);
        System.out.println("Impuestos aplicados: $" + impuestos);
    }

    @Override
    public double calcularImpuestos(double cantidad) {
        return cantidad * IMPUESTO_TARJETA_CREDITO;
    }
}
