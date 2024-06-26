Patrón template method
---

**Objetivo:**

Realizar el diagrama UML y programar en Java, implementando patrón template según el siguiente enunciado.


**Consigna:**

Para realizar la liquidación de sueldos es necesario realizar **tres pasos**: calcular el
sueldo correspondiente, imprimir o generar recibos de sueldo y depositar el importe
correspondiente.

Hay dos tipos de empleados. **Los empleados efectivos**, el cálculo es a partir de un
sueldo básico y se agregan descuentos y premios. **Los empleados contratados** trabajan
una cantidad de horas, con una tarifa por hora específica. Con esta información se
realiza el cálculo del sueldo a pagar y luego se imprime. Finalmente, se deposita.

El proceso que realizamos es **liquidarSueldo()**. Este lleva tres pasos: cálculo,
impresión y depósito. En cuanto al cálculo, este se realiza según el tipo de empleado.

La impresión puede ser digital —en el caso de los contratados— o en un recibo en
papel —en el caso de los efectivos—. Por último el depósito es en una cuenta
bancaria.

Todos los empleados tienen nombre, apellido y un número de cuenta que servirá para
dirigir los sueldos. Los empleados efectivos tienen como información: sueldo básico y
un valor fijo de descuentos y otro de premios. Los empleados contratados tienen
cantidad de horas trabajadas y valor por hora.

Para certificar la calidad de nuestro programa, tendremos los siguientes casos de
prueba:

**CASO 1:** Debería emitir un documento en papel cuando es un empleado efectivo.
* Dado: Un empleado efectivo, Martín Martini, con un sueldo básico de 400, un
valor fijo de descuentos de 40 y un total de 60 en premios.
* Cuando: Intento calcular la liquidación.
* Entonces: Obtengo el mensaje “La liquidación generada es un documento
impreso. Saldo a liquidar: 420”.

**CASO 2:** Debería emitir un documento digital cuando es un empleado contratado.
* Dado: Una empleada contratada, Pompilia Pompini, con 120 horas trabajadas y
una tarifa de 7 por hora.
* Cuando: Intento calcular la liquidación.
* Entonces: Obtengo el mensaje “La liquidación generada es un documento
digital. Saldo a liquidar: 840”.

**CASO 3:** El liquidador debería arrojar un mensaje de error cuando no es posible
calcular la liquidación.
* Dados: Un liquidador de empleado efectivo y una empleada contratada, Pompilia
Pompini.
* Cuando: Intento calcular la liquidación.
* Entonces: Obtengo el mensaje “La liquidación no pudo ser calculada”.

¡Muchos éxitos!

**Realizado por :** Sammy Gigi Cantoral Montejo (sgcm14)

<img src ="https://raw.githubusercontent.com/sgcm14/sgcm14/main/sammy.jpg" width="200">
