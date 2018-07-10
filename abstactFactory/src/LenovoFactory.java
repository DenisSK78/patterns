public class LenovoFactory implements ComputerFactories {

    @Override
    public LenovoLaptop createLaptop() {
        return new LenovoLaptop();
    }

    @Override
    public LenovoTablet createTablet() {
        return new LenovoTablet();
    }
}
