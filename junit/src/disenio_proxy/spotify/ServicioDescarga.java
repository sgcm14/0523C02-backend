package disenio_proxy.spotify;

public class ServicioDescarga implements IDescargaOffline {
    @Override
    public void descargar(String cancion) {

        //System.out.println("Descargando canción: "+cancion+"...");

        try {
            // Lógica de descarga de la canción
            System.out.println("Descargando canción: " + cancion + "...");
        } catch (Exception e) {
            System.out.println("Error al descargar la canción: " + e.getMessage());
            // Manejar la excepción adecuadamente según el contexto
        }
    }
}
