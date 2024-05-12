Patrón facade
---

**Objetivo:**

Realizar el diagrama UML y programar en Java, implementando patrón facade , según el siguiente enunciado. A tener en cuenta:
- Ejercicio individual
- Nivel de complejidad: intermedio 🔥🔥



**Consigna:**

Ahora imaginemos una implementación...
Supongamos que tenemos que diseñar un sistema para un e-commerce. Nuestro cliente nos pide que al momento de efectuar la venta del producto, nuestro sistema debería realizar una serie de pasos, por ejemplo: pedir el producto al almacén, acreditar el pago y enviar el pedido.
Veamos cómo podemos resolver este problema aplicando este patrón.


![](https://raw.githubusercontent.com/sgcm14/0523C02-backend/main/junit/src/disenio_facade/compras/Captura.PNG)

Mediante una **interface** definimos cómo el cliente se deberá comunicar con nuestro sistema, definimos la clase **CompraService** que actuará de **fachada**, recibiendo las peticiones y  comunicándose con los subsistemas para que en conjunto, se complete la compra.


**Realizado por :** Sammy Gigi Cantoral Montejo (sgcm14)

<img src ="https://raw.githubusercontent.com/sgcm14/sgcm14/main/sammy.jpg" width="200">
