package creational.abstractfactory;

abstract class GamerLaptop extends Laptop {
    GamerLaptop(String cpu, String gpu, int ram, int battery) {
        super(cpu, gpu, ram, battery);
    }

    void play(String game) {
        String message = String.format("Playing %s", game);
        IO.println(message);
    }
}
