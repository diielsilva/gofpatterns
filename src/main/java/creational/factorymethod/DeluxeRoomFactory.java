package creational.factorymethod;

import java.util.List;

class DeluxeRoomFactory implements RoomFactory {
    @Override
    public Room create() {
        return new DeluxeRoom("A luxury room packed with amenities", 130.9F, List.of("Fridge", "Hot Shower"));
    }
}
