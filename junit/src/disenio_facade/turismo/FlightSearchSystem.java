package disenio_facade.turismo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightSearchSystem {

    List<Flight> flights = new ArrayList<>();

    public FlightSearchSystem() {
        flights.add(new Flight(LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 10), "CityA", "CityB"));
        flights.add(new Flight(LocalDate.of(2024, 6, 5), LocalDate.of(2024, 6, 15), "CityA", "CityB"));
    }

    public List<Flight> searchFlights(LocalDate checkInDate, LocalDate checkOutDate, String city) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.departureDate.isEqual(checkInDate) && flight.returnDate.isEqual(checkOutDate)
                    && flight.destination.equals(city)) {
                result.add(flight);
            }
        }
        return result;
    }
}
