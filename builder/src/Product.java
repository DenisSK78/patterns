public class Product {

    private int part1;
    private String part2;

    void setPart1(int part1) {
        this.part1 = part1;
    }

    void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return "Product{" +
                "part1=" + part1 +
                ", part2='" + part2 + '\'' +
                '}';
    }
}
