package builder.v1;

public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void buildPart1(int part1) {
        product.setPart1(part1);
    }

    @Override
    public void buildPart2(String part2) {
        product.setPart2(part2);
    }
}
