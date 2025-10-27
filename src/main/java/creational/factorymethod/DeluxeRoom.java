package creational.factorymethod;

import java.util.List;

class DeluxeRoom extends Room {
    DeluxeRoom(String description, float price, List<String> amenities) {
        super(description, price, amenities);
    }

    @Override
    public String toString() {
        return "DeluxeRoom {" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", amenities=" + amenities +
                '}';
    }
}
