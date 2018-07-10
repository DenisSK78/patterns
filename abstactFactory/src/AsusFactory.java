public class AsusFactory implements ComputerFactories {

    @Override
    public AsusLaptop createLaptop() {
        return new AsusLaptop();
    }

    @Override
    public AsusTablet createTablet() {
        return new AsusTablet();
    }
}
