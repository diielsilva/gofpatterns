package creational.abstractfactory;

abstract class OfficeLaptop extends Laptop {
    OfficeLaptop(String cpu, String gpu, int ram, int battery) {
        super(cpu, gpu, ram, battery);
    }

    void execute(String task) {
        String message = String.format("Executing %s", task);
        IO.println(message);
    }
}
