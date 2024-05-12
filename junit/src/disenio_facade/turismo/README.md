Patrón facade
---

**Objetivo:**

Realizar el diagrama UML y programar en Java, implementando patrón Facade, según el
siguiente enunciado.
A tener en cuenta:
- Ejercicio grupal
- Nivel de complejidad: intermedio 🔥🔥



**Consigna:**

Cuando vamos a contratar un servicio de turismo como un vuelo o un hotel, tenemos que
solicitar cada uno por separado. Vamos a crear un sistema que permita realizar la
búsqueda de hotel y vuelo en un mismo pedido. Para esto será necesario interactuar con
dos sistemas.

Tenemos **ya implementados** los sistema de vuelo y hoteles que poseen la funcionalidad
de búsqueda según:

● **Búsqueda vuelo:** por fecha de salida, fecha de regreso, origen y destino.

● **Búsqueda hotel:** por fecha de entrada, fecha de salida, ciudad.


Se implementará una simple fachada que permita exponer un **método que realice las
búsquedas**, encargándose en interactuar con los sistemas de búsqueda y no tener que
lidiar con la complejidad de dichos sistemas desde el método main.

Se necesita visualizar por pantalla qué vuelos y hoteles están disponibles. Los parámetros
de búsqueda son solamente la ciudad del hotel (String), que es la misma que la del destino
del vuelo, y la fecha desde-donde, que es igual para la búsqueda de vuelo y hotel.

El pedido a la fachada por lo tanto en una sola llamada incluye los otros dos.

No olvidemos implementar los casos de prueba necesarios para poder garantizar la calidad
del código realizado.
¡Muchos éxitos!

**Realizado por :** Sammy Gigi Cantoral Montejo (sgcm14)

<img src ="https://raw.githubusercontent.com/sgcm14/sgcm14/main/sammy.jpg" width="200">
