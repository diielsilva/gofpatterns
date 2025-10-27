package creational.factorymethod;

import java.util.List;

abstract class Room {
    protected final String description;
    protected final float price;
    protected final List<String> amenities;

    protected Room(String description, float price, List<String> amenities) {
        this.description = description;
        this.price = price;
        this.amenities = amenities;
    }

    String getDescription() {
        return description;
    }

    float getPrice() {
        return price;
    }

    List<String> getAmenities() {
        return amenities;
    }
}
