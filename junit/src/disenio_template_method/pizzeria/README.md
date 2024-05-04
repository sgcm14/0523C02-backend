Patrón template method
---

**Objetivo:**

Veamos un ejemplo del patrón haciendo una analogía con un ejemplo de la vida real. Pensemos en una pizzería y en el proceso de preparar diferentes tipos de pizzas. Intentemos identificar los pasos que un cocinero debe realizar para cocinar y entregar una pizza. Podrían ser:

- Preparar la masa.
- Precocinar la masa.
- Preparar los ingredientes.
- Agregar los ingredientes.
- Cocinar la pizza.
- Empaquetar la pizza
  Por cada variedad de pizza, los cocineros tienen que hacer todos esos pasos.

  Aplicando el patrón template method, podríamos crear el método esqueleto, con los pasos comunes a todas las pizzas y dejar que los cocineros solo se preocupen por los pasos que no son comunes a todas las pizzas, en este caso, preparar los ingredientes y agregar los ingredientes. Veamos cómo representamos esta solución en un diagrama UML.

![](https://raw.githubusercontent.com/sgcm14/0523C02-backend/main/junit/src/disenio_template_method/pizzeria/Captura.PNG)

**Realizado por :** Sammy Gigi Cantoral Montejo (sgcm14)

<img src ="https://raw.githubusercontent.com/sgcm14/sgcm14/main/sammy.jpg" width="200">
