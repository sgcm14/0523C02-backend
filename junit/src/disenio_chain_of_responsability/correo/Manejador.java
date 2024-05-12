package disenio_chain_of_responsability.correo;

public abstract class Manejador {
    private Manejador siguienteManejador;

    public Manejador getSiguienteManejador() {
        return siguienteManejador;
    }

    public void setSiguienteManejador(Manejador siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    public abstract String comprobar(Mail mail);
}

