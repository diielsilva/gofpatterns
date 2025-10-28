package creational.abstractfactory;

abstract class Laptop {
    protected String cpu;
    protected String gpu;
    protected int ram;
    protected int battery;

    Laptop(String cpu, String gpu, int ram, int battery) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram=" + ram +
                ", battery=" + battery +
                '}';
    }
}
