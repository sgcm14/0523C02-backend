package disenio_facade.turismo;

import java.time.LocalDate;
import java.util.Date;

public interface ITravelFacade {
    void search(String city, LocalDate date);
}
