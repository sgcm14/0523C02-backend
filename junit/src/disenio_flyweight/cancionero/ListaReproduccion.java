package disenio_flyweight.cancionero;

import java.util.ArrayList;
import java.util.List;

public class ListaReproduccion {
    private String nombre;
    private List<CancionDTO> canciones;

    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(CancionDTO cancion) {
        canciones.add(cancion);
    }

    public void eliminarCancion(CancionDTO cancion) {
        canciones.remove(cancion);
    }

    public List<CancionDTO> obtenerCanciones() {
        return canciones;
    }

    public void mostrarLista() {
        System.out.println("Lista de Reproducción: " + nombre);
        for (CancionDTO cancion : canciones) {
            System.out.println("Nombre: " + cancion.getNombre() + ", Artista: " + cancion.getArtista() + ", Género: " + cancion.getGenero());
        }
    }
}

