package disenio_facade.turismo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class HotelSystem {
    List<Hotel> hotels = new ArrayList<>();

    public HotelSystem() {
        hotels.add(new Hotel("Hotel A", "CityB"));
        hotels.add(new Hotel("Hotel B", "CityB"));
    }

    public List<Hotel> searchHotels(LocalDate checkInDate, LocalDate checkOutDate, String city) {
        List<Hotel> result = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotel.city.equals(city)) {
                result.add(hotel);
            }
        }
        return result;
    }
}
