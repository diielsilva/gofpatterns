package creational.factorymethod;

import java.util.List;

class StandardRoomFactory implements RoomFactory {
    @Override
    public Room create() {
        return new StandardRoom("A simple and cheap root to sleep at night", 89.9F, List.of());
    }
}
