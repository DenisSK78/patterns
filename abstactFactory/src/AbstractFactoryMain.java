import java.util.Arrays;
import java.util.List;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        ComputerFactories factoriesL = new LenovoFactory();
        ComputerFactories factoriesA = new AsusFactory();

        Laptop lapL = factoriesL.createLaptop();
        Tablet tabL = factoriesL.createTablet();

        Laptop lapA = factoriesA.createLaptop();
        Tablet tabA = factoriesA.createTablet();

        List<Computer> allComps = Arrays.asList(lapL, tabL, lapA, tabA);
        allComps.forEach(System.out::println);
        allComps.forEach(Computer::doSomething);
    }
}
