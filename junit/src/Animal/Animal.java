package Animal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Animal {
    private String tipo; //caballo, perro, gato
    private String tamanio; //grande , mediano y chico

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private int peso;

    public Animal(String tipo, String tamanio, int peso) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.peso = peso;
    }

    public boolean esPesado(){
        return this.peso > 2000  && this.tamanio.equals("grande");
    }
}