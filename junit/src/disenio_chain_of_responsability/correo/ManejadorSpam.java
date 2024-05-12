package disenio_chain_of_responsability.correo;

public class ManejadorSpam  extends Manejador{
    @Override
    public String comprobar(Mail mail) {
        return "mail movido a spam";
    }
}
