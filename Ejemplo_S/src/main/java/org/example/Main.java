package org.example;

import org.example.bien_aplicado.CalculadorSalario;
import org.example.bien_aplicado.Empleado;
import org.example.bien_aplicado.ProcesadorAscensos;
import org.example.bien_aplicado.VisualizadorEmpleado;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Vicente Cara", 3000.00, 6);

        VisualizadorEmpleado visualizador = new VisualizadorEmpleado();
        visualizador.verEmpleado(empleado1);

        CalculadorSalario calculador = new CalculadorSalario();
        double salarioNeto1 = calculador.calcularSalarioNeto(empleado1);
        System.out.println("Salario Neto: $" + salarioNeto1);

        ProcesadorAscensos ascenso = new ProcesadorAscensos();
        ascenso.procesarAscenso(empleado1);

    }
}