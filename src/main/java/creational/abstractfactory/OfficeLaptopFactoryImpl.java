package creational.abstractfactory;

class OfficeLaptopFactoryImpl implements OfficeLaptopFactory {
    private int whichLaptopShouldICreate = 1;

    @Override
    public OfficeLaptop create() {
        OfficeLaptop laptop = null;

        if (whichLaptopShouldICreate % 2 == 0) {
            laptop = new AsusZenbook();
        } else {
            laptop = new MicrosoftSurface();
        }

        whichLaptopShouldICreate++;

        return laptop;
    }
}
