Patrón cadena de responsabilidad
---

**Objetivo:**
Realizar el diagrama UML y programar en Java implementando patrón cadena de
responsabilidad según el siguiente enunciado.


**Consigna:**

En la empresa llamada Colmena hay tres departamentos: gerencia, comercial y técnico.
Cuando reciben un correo electrónico (en su dominio colmena.com) quieren que se
controle de acuerdo con las reglas de inteligencia artificial de la empresa y enviarlo al
departamento que corresponda.

Nosotros vamos a simular este control suponiendo que:

| Tema (Subject) | Mail de Destino       | Departamento      |
|----------------|-----------------------|-------------------|
| Gerencia       | gerencia@colmena.com  | Gerencial         |
| Comercial      | comercial@colmena.com | Comercial         |
| Técnico        | tecnica@colmena.com   | Técnico           |
| Cualquier otro | Cualquier otro        | Marcado como SPAM |


Para ello vamos a mostrar por pantalla dónde se recibe el pedido en cada caso. El correo
electrónico pertenece a una clase mail que tiene tres datos tipo string: el origen, el destino
y el tema (o subject).

Se desea hacer una clase CompruebaMail que cree una cadena de responsabilidades.
Esta funcionará chequeando cada elemento (parte de la cadena). Si el mail es para
Gerencia, lo informará. Si no, continúa con el siguiente chequeo que prueba si es para
Técnica, y así continuará hasta saber a quién le corresponde. Si no es de nadie, se
marcará como spam.

Por último, desde una clase ProcesaMail, se crea un mail y se le pide a CompruebaMail
que lo procese e informe donde debe ir.

Realizar los casos de prueba necesarios para garantizar la calidad del método
comprobarMail() de la clase CompruebaMail.
¡Muchos éxitos!

**Realizado por :** Sammy Gigi Cantoral Montejo (sgcm14)

<img src ="https://raw.githubusercontent.com/sgcm14/sgcm14/main/sammy.jpg" width="200">
