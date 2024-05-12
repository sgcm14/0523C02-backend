Patrón flyweight
---

**Objetivo:**

Realizar el diagrama UML y programar en Java, implementando patrón flyweight , según el siguiente enunciado. A tener en cuenta:
- Ejercicio individual
- Nivel de complejidad: intermedio 🔥🔥



**Consigna:**

Supongamos que tenemos un **recetario** que contiene **recetas** que están en diferentes colecciones como carne; sopas; ensaladas; o en diferentes **categorías** como comida italiana; mexicana; argentina; rápidas.

La receta para una hamburguesa podría estar en varias **secciones**: americana, carnes, rapidas, etc. Si necesitáramos tener un objeto receta hamburguesa en cada una de las colecciones sería muy poco performante y se usaría mucha memoria.

Entonces, el cliente pide un objeto a la FlyweightFactory, esta se fija si existe en el caché y en caso contrario crea uno nuevo. Flyweight comparte el estado de los objetos.

Veamos cómo representamos esta solución en un diagrama UML.

![](https://raw.githubusercontent.com/sgcm14/0523C02-backend/main/junit/src/disenio_flyweight/hamburgueseria/Captura.PNG)



**Realizado por :** Sammy Gigi Cantoral Montejo (sgcm14)

<img src ="https://raw.githubusercontent.com/sgcm14/sgcm14/main/sammy.jpg" width="200">
