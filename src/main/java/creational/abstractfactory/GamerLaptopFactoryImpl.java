package creational.abstractfactory;

class GamerLaptopFactoryImpl implements GamerLaptopFactory {
    private int whichLaptopShouldICreate = 1;

    @Override
    public GamerLaptop create() {
        GamerLaptop laptop = null;

        if (whichLaptopShouldICreate % 2 == 0) {
            laptop = new AcerNitro();
        } else {
            laptop = new LenovoLegion();
        }

        whichLaptopShouldICreate++;

        return laptop;
    }
}
