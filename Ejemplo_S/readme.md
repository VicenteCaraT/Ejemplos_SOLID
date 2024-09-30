# Ejemplo Single Resoponsibility
En este ejemplo una única clas Empleado se encarga de:
- Almacenar los datos del empleado (nombre, salario, años de servicio).
- Calcular el Salario Neto
- Procesar los ascensos basados en los años de servicio.
- Visualizar los datos del empleado.

Este diseño mezcla varias responsabilidades en una sola clase, lo que lleva a un código dificil de mantener y posibles errores.

Para Solucionar este problema he dividido las responsabilidades de la clase Empleado en varias clases especializadas. cada una se encarga de una tarea específica.

### Clase Empleado:
- Su unica responsabilidad es almaenar los datos del empleado.
### Clase CalculadorSalario:
- Se encarga de calcular el salario neto
### Clase ProcesadorAscenso:
- Se encarga de procesar los ascensos del empleado, verificando si cumple los requisitos.
### Clase VisualizadorEmpleado:
- Se encarga de mostrar la información del Empleado
