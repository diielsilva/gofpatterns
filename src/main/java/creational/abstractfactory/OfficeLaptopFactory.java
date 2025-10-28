package creational.abstractfactory;

interface OfficeLaptopFactory extends LaptopFactory {
    @Override
    OfficeLaptop create();
}
