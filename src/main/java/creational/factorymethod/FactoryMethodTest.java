package creational.factorymethod;

class FactoryMethodTest {
    private FactoryMethodTest() {
    }

    static void main() {
        RoomFactory standardRoomFactory = new StandardRoomFactory();
        RoomFactory deluxeRoomFactory = new DeluxeRoomFactory();

        Room standardRoom = standardRoomFactory.create();
        Room deluxeRoom = deluxeRoomFactory.create();

        IO.println(standardRoom);
        IO.println(deluxeRoom);
    }
}
