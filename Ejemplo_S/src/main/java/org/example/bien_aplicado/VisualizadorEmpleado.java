package org.example.bien_aplicado;

public class VisualizadorEmpleado {
    public void verEmpleado(Empleado empleado) {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario: $" + empleado.getSalario());
        System.out.println("Años de Servicio: " + empleado.getAñosDeServicio());
    }
}
