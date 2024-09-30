package org.example.bien_aplicado;

public class ProcesadorAscensos {
    public  void procesarAscenso(Empleado empleado) {
        if (empleado.getAñosDeServicio() > 5) {
            System.out.println(empleado.getNombre() + " ha sido ascendido.");
        } else {
            System.out.println(empleado.getNombre() + " aún no califica para un ascenso.");
        }
    }
}
