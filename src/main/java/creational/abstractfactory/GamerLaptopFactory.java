package creational.abstractfactory;

interface GamerLaptopFactory extends LaptopFactory {
    @Override
    GamerLaptop create();
}
