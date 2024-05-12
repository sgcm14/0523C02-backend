package disenio_facade.turismo;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TravelFacadeTest {
    @Test
    public void testSearchFlights() {
        FlightSearchSystem flightSearchSystem = new FlightSearchSystem();
        LocalDate checkInDate = LocalDate.of(2024, 6, 1);
        LocalDate checkOutDate = LocalDate.of(2024, 6, 10);
        String city = "CityB";

        List<Flight> result = flightSearchSystem.searchFlights(checkInDate, checkOutDate, city);

        assertEquals(1, result.size());
        Flight flight = result.get(0);
        assertEquals(LocalDate.of(2024, 6, 1), flight.departureDate);
        assertEquals(LocalDate.of(2024, 6, 10), flight.returnDate);
        assertEquals("CityA", flight.origin);
        assertEquals("CityB", flight.destination);
    }

    @Test
    public void testSearchHotels() {
        HotelSystem hotelSystem = new HotelSystem();
        LocalDate checkInDate = LocalDate.of(2024, 6, 1);
        LocalDate checkOutDate = LocalDate.of(2024, 6, 10);
        String city = "CityB";

        List<Hotel> result = hotelSystem.searchHotels(checkInDate, checkOutDate, city);

        assertEquals(2, result.size());
        Hotel hotel1 = result.get(0);
        assertEquals("Hotel A", hotel1.name);
        assertEquals("CityB", hotel1.city);
        Hotel hotel2 = result.get(1);
        assertEquals("Hotel B", hotel2.name);
        assertEquals("CityB", hotel2.city);
    }



}