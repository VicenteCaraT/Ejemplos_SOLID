# Ejemplo Open Closed

![Captura de pantalla 2024-09-30 105435](https://github.com/user-attachments/assets/2717af61-402e-40b2-b88c-e42ba5362295)

El objetivo es crear un sistema que permita procesar pagos utilizando diferentes métodos de pago, como tarjeta de crédito, PayPal y transferencia bancaria. Cada método de pago debe tener sus propios impuestos aplicados, y estos impuestos deben ser calculados al momento de procesar el pago.
basado en una implementación que no seguía los principios de Open/Closed y Single Responsibility del diseño orientado a objetos. En la solución original (mal aplicada), el sistema utilizaba condicionales (if o switch) dentro de una única clase (ProcesadorDePagos)

Para solucionar este problem  se aplica el Principio de Inversión de Dependencias utilizando interfaces y se sigue el principio Open/Closed. La solución propuesta utiliza una interfaz MetodoDePago que define las operaciones comunes de todos los métodos de pago. Cada método de pago, como tarjeta de crédito, PayPal y transferencia bancaria, se implementa como una clase independiente que sigue esta interfaz.

![Captura de pantalla 2024-09-30 105516](https://github.com/user-attachments/assets/bbe31931-820f-4379-b08c-05e4e294c9b9)
