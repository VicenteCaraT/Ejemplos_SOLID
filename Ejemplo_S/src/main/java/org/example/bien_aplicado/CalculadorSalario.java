package org.example.bien_aplicado;

public class CalculadorSalario {
    public double calcularSalarioNeto(Empleado empleado) {
        return empleado.getSalario() - (empleado.getSalario() * 0.2);
    }
}
