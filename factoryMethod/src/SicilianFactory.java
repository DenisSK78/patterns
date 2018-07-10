public class SicilianFactory implements Factory {
    @Override
    public Pizza createPizza() {
        return new SicilianPizza();
    }
}
