package PersonaMayor;

public class Persona {
    private String name;
    private Integer age;

    public Persona(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isOlderAge(){
        return this.age>=18;
    }

    public boolean checkAge(){
        boolean responseAge = false;
        if(age>0 && age<=120){
            responseAge=true;
        }
        return responseAge;
    }

    public boolean lengthOfLetters(){
        return name.length()>4;
    }

    public boolean checkAZ(){
        boolean responseAZ= false;
        char[] arrayNames = name.toCharArray();
        for (char letter : arrayNames) {
            if(!Character.isLetter(letter)){
                return responseAZ;
            }
        }
        responseAZ = true;
        return responseAZ;
    }
}
