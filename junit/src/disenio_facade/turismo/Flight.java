package disenio_facade.turismo;

import java.time.LocalDate;

public class Flight {
    LocalDate departureDate;
    LocalDate returnDate;
    String origin;
    String destination;

    public Flight(LocalDate departureDate, LocalDate returnDate, String origin, String destination) {
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureDate=" + departureDate +
                ", returnDate=" + returnDate +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
