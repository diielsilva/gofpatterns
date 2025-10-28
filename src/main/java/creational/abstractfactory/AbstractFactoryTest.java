package creational.abstractfactory;

import java.util.List;

class AbstractFactoryTest {
    private AbstractFactoryTest() {
    }

    static void main() {
        LaptopFactory gamerFactory = new GamerLaptopFactoryImpl();
        LaptopFactory officeFactory = new OfficeLaptopFactoryImpl();

        List<Laptop> laptops = List.of(
                gamerFactory.create(),
                gamerFactory.create(),
                gamerFactory.create(),
                gamerFactory.create(),
                officeFactory.create(),
                officeFactory.create(),
                officeFactory.create(),
                officeFactory.create()
        );

        for (Laptop laptop : laptops) {
            IO.println(laptop);
        }
    }
}
