package PersonaMayor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GrupoPersonaTest {

    @Test
    public void addPerson() {
        //DADO - GIVEN
        Persona persona1= new Persona("Juan", 18);
        Persona persona2= new Persona("Pedro", 20);
        Persona persona3= new Persona("Ana", 22);
        Persona persona4= new Persona("Luz", 14);
        Persona persona5= new Persona("Julian", 32);

        //CUANDO - WHEN
        GrupoPersona grupoPersona= new GrupoPersona();
        grupoPersona.addPerson(persona1);
        grupoPersona.addPerson(persona2);
        grupoPersona.addPerson(persona3);
        grupoPersona.addPerson(persona4);
        grupoPersona.addPerson(persona5);

        //ENTONCES - THEN
        Assertions.assertTrue(grupoPersona.getPeople().size()==2);
    }
}