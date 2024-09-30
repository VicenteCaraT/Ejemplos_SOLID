package org.example.bien_aplicado;

public class PagoTransferenciaBancaria implements MetodoDePago {
    private static final double IMPUESTO_TRANSFERENCIA = 0.015;
    @Override
    public void procesarPago(double cantidad) {
        double impuestos = calcularImpuestos(cantidad);
        double total = cantidad + impuestos;
        System.out.println("Procesando pago con transferencia bancaria: $" + total);
        System.out.println("Impuestos aplicados: $" + impuestos);
    }

    @Override
    public double calcularImpuestos(double cantidad) {
        return cantidad * IMPUESTO_TRANSFERENCIA;
    }
}
