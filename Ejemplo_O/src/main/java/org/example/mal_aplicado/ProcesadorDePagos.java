package org.example.mal_aplicado;

public class ProcesadorDePagos {
    private static final double IMPUESTO_TARJETA_CREDITO = 0.02;
    private static final double IMPUESTO_PAYPAL = 0.03;
    private static final double IMPUESTO_TRANSFERENCIA_BANCARIA = 0.015;

    public void procesarPago(String metodoDePago, double cantidad) {
        double impuestos = 0.0;
        double total = cantidad;

        switch (metodoDePago) {
            case "tarjetaCredito" -> {
                impuestos = calcularImpuestosTarjetaCredito(cantidad);
                total += impuestos;
                System.out.println("Procesando pago con tarjeta de crédito: $" + total);
                System.out.println("Impuestos aplicados: $" + impuestos);
            }
            case "paypal" -> {
                impuestos = calcularImpuestosPayPal(cantidad);
                total += impuestos;
                System.out.println("Procesando pago con PayPal: $" + total);
                System.out.println("Impuestos aplicados: $" + impuestos);
            }
            case "transferenciaBancaria" -> {
                impuestos = calcularImpuestosTransferenciaBancaria(cantidad);
                total += impuestos;
                System.out.println("Procesando pago con transferencia bancaria: $" + total);
                System.out.println("Impuestos aplicados: $" + impuestos);
            }
            default -> System.out.println("Método de pago no soportado.");
        }
    }

    private double calcularImpuestosTarjetaCredito(double cantidad) {
        return cantidad * IMPUESTO_TARJETA_CREDITO;
    }

    private double calcularImpuestosPayPal(double cantidad) {
        return cantidad * IMPUESTO_PAYPAL;
    }

    private double calcularImpuestosTransferenciaBancaria(double cantidad) {
        return cantidad * IMPUESTO_TRANSFERENCIA_BANCARIA;
    }
}