package creational.builder;

class AddressBuilder {
    private Address address;

    private AddressBuilder() {
        this.address = new Address();
    }

    static AddressBuilder builder() {
        return new AddressBuilder();
    }

    AddressBuilder street(String street) {
        address.setStreet(street);
        return this;
    }

    AddressBuilder neighborhood(String neighborhood) {
        address.setNeighborhood(neighborhood);
        return this;
    }

    AddressBuilder city(String city) {
        address.setCity(city);
        return this;
    }

    AddressBuilder state(String state) {
        address.setState(state);
        return this;
    }

    AddressBuilder country(String country) {
        address.setCountry(country);
        return this;
    }

    Address build() {
        Address createdAddress = address;
        address = new Address();

        return createdAddress;
    }
}
