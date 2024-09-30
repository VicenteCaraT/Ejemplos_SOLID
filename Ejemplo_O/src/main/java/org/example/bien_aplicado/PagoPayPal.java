package org.example.bien_aplicado;

public class PagoPayPal implements MetodoDePago {
    private static final double IMPUESTO_PAYPAL = 0.03;
    @Override
    public void procesarPago(double cantidad) {
        double impuestos = calcularImpuestos(cantidad);
        double total = cantidad + impuestos;
        System.out.println("Procesando pago con PayPal: $" + total);
        System.out.println("Impuestos aplicados: $" + impuestos);
    }

    @Override
    public double calcularImpuestos(double cantidad) {
        return cantidad * IMPUESTO_PAYPAL;
    }
}
