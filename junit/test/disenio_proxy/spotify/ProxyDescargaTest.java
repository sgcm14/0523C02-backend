package disenio_proxy.spotify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyDescargaTest {

    @Test
    void descargarCancion_PremiumUser_Success() {
        Usuario premiumUser = new Usuario();
        premiumUser.setTipoUsuario(TipoUsuario.PREMIUM);
        ProxyDescarga proxy = new ProxyDescarga(new ServicioDescarga(), premiumUser);
        assertDoesNotThrow(() -> proxy.descargar("Cancion1.mp3"));
    }

    @Test
    void descargarCancion_FreeUser_Failure() {
        Usuario freeUser = new Usuario();
        freeUser.setTipoUsuario(TipoUsuario.FREE);
        ProxyDescarga proxy = new ProxyDescarga(new ServicioDescarga(), freeUser);
        assertThrows(Exception.class, () -> proxy.descargar("Cancion2.mp3"));
    }
}