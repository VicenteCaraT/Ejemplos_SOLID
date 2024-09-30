package org.example.bien_aplicado;

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
    private int añosDeServicio;
}
