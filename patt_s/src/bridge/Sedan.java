package bridge;

public class Sedan extends Car {

    public Sedan(Make make) {
        super(make);
    }

    @Override
    void showDetails() {
        System.out.print("Sedan: ");
        make.setMake();
    }
}
