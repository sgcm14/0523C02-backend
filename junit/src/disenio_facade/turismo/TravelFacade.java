package disenio_facade.turismo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class TravelFacade implements ITravelFacade {
    private FlightSearchSystem flightSearchSystem;
    private HotelSystem hotelSearchSystem;

    public TravelFacade() {
        this.flightSearchSystem = new FlightSearchSystem();
        this.hotelSearchSystem = new HotelSystem();
    }

    // Método para buscar vuelos y hoteles en una sola llamada

    @Override
    public void search(String city, LocalDate date) {

            List<Flight> flights = flightSearchSystem.searchFlights(date, date.plusDays(9), "CityA");
            List<Flight> flights2 = flightSearchSystem.searchFlights(date, date.plusDays(5), "CityB");
            List<Hotel> hotels = hotelSearchSystem.searchHotels(date, date.plusDays(9), "CityA");
            List<Hotel> hotels2 = hotelSearchSystem.searchHotels(date, date.plusDays(5), "CityB");

            System.out.println("Flights available to " + city + " on " + date + ":");
            for (Flight flight : flights) {
                System.out.println(flight);
            }

            System.out.println("Hotels available in " + city + " from " + date + ":");
            for (Hotel hotel : hotels) {
                System.out.println(hotel);
            }

    }
}
