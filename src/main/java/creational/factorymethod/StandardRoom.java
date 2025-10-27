package creational.factorymethod;

import java.util.List;

class StandardRoom extends Room {
    StandardRoom(String description, float price, List<String> amenities) {
        super(description, price, amenities);
    }

    @Override
    public String toString() {
        return "StandardRoom {" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", amenities=" + amenities +
                '}';
    }
}
