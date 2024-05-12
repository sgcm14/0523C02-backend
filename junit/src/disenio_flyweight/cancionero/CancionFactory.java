package disenio_flyweight.cancionero;

import java.util.HashMap;
import java.util.Objects;

public class CancionFactory {
    private static final HashMap<String, CancionDTO> CANCION_MAP = new HashMap<>();

    public CancionDTO getCancion(final String nombreCancion) {
        CancionDTO listaCanciones = CANCION_MAP.get(nombreCancion);
        if (Objects.isNull(listaCanciones)) {
            listaCanciones = new CancionDTO(nombreCancion);
            CANCION_MAP.put(nombreCancion, listaCanciones);
            System.out.println("Creando Objecto de cancion con nombre: " + nombreCancion);
            return listaCanciones;

        }
        System.out.println("Recuperando Objecto de cancion con nombre: " + nombreCancion);
        return listaCanciones;

    }

}
