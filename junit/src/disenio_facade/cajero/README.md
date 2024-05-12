Patrón facade
---

**Objetivo:**

Realizar el diagrama UML y programar en Java, implementando patrón facade , según el siguiente enunciado. A tener en cuenta:
- Ejercicio individual
- Nivel de complejidad: intermedio 🔥🔥



**Consigna:**

Imaginate que tenés que aplicar el patrón facade en un sistema para retirar dinero en el cajero. Contás con tres servicios (subsistemas) disponibles para usar: uno se encargará de la **autenticación (AutenticationService)**, otro de traer los **datos de la cuenta bancaria (CuentaService)** y el último de **solicitar al banco el efectivo (CajaService)**. Queremos que el cliente pueda retirar dinero enviando al sistema el número de identificación, contraseña y saldo a retirar, sin tener que utilizar directamente estos servicios.

El servicio de autenticación, cuenta con un método llamado **validarUsuarioYContrasena**, que recibirá un identificador del usuario (DNI) y contraseña.

El servicio que nos trae la información de la cuenta tiene un método llamado **getCuenta**, que recibirá solamente el identificador del usuario (DNI). Este servicio lo deberíamos usar solamente luego de utilizar el servicio de autenticación. La cuenta está compuesta por un campo de **identificación del usuario** y otro de **saldo actual**.

Y por último tenemos el servicio de CAJA, que es el encargado de retirar dinero del banco. Este servicio tiene un método llamado **entregarDinero**, que recibirá el monto a retirar del banco.

Luego de verificar que el usuario tiene el dinero que quiere retirar, deberíamos usar el servicio de caja. Te proponemos realizar diagrama de clases e implementación en JAVA. ¡Éxitos!


**Realizado por :** Sammy Gigi Cantoral Montejo (sgcm14)

<img src ="https://raw.githubusercontent.com/sgcm14/sgcm14/main/sammy.jpg" width="200">
