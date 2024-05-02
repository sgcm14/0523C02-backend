package PersonaMayor;

import java.util.ArrayList;
import java.util.List;

public class GrupoPersona {
    private List<Persona> people;

    public GrupoPersona() {
        people= new ArrayList<>();
    }

    public List<Persona> getPeople(){
        return people;
    }

    public void addPerson(Persona person){
        boolean checkOlderAge = person.isOlderAge();
        boolean checkLengthOfName = person.lengthOfLetters();
        boolean onlyLetters = person.checkAZ();
        boolean checkAge = person.checkAge();
        if(checkOlderAge && checkLengthOfName && onlyLetters && checkAge){
            people.add(person);
        } else{
            System.out.println("No se pudo agregar a la persona: "+person.getName()+" :"+person.getAge());
        }
    }
}
