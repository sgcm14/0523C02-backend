package disenio_chain_of_responsability.correo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompruebaMailTest {

    @Test
    public void mailASpam(){
        //DADO
        CompruebaMail colmena= new CompruebaMail();
        Mail mail= new Mail("jorge.pereyra@digitalhouse.com","digital","tecnico");
        String respEsp= "Lo esta atendiendo Tecnico";
        //CUANDO
        String respActual= colmena.disparadorcadena(mail);
        //ENTONCES
        Assertions.assertEquals(respActual,respEsp);

    }

}