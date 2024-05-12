package disenio_facade.turismo;

class Hotel {
    String name;
    String city;

    public Hotel(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Hotel " + name + " in " + city ;
    }
}
