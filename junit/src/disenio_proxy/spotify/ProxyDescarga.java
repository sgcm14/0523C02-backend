package disenio_proxy.spotify;

public class ProxyDescarga implements IDescargaOffline{

    private ServicioDescarga servicioDescarga;
    private Usuario usuario;

    public ProxyDescarga(ServicioDescarga servicioDescarga, Usuario usuario) {
        this.servicioDescarga = servicioDescarga;
        this.usuario = usuario;
    }

    @Override
    public void descargar(String cancion) {
        if(usuario.getTipoUsuario().equals(TipoUsuario.PREMIUM)){
            this.servicioDescarga.descargar(cancion);
        } else{
            System.out.println("No se puede descargar la canción: "+ cancion);
        }

    }
}
