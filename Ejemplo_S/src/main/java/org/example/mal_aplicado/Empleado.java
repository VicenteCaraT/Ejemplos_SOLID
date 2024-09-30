package org.example.mal_aplicado;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Empleado {
    private String nombre;
    private double salario;
    private  int añosDeServicio;

    public double calcularSalarioNeto() {
        return salario - (salario* 0.2);
    }

    public void procesoAscenso() {
        if (añosDeServicio > 5) {
            System.out.println(nombre + " ha sido ascendido.");
        } else {
            System.out.println(nombre + " aún no califíca para un ascenso");
        }
    }

    public void verEmpleado(Empleado empleado) {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario: $" + empleado.getSalario());
        System.out.println("Años de Servicio: " + empleado.getAñosDeServicio());
    }
}
