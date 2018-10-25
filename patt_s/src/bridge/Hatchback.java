package bridge;

public class Hatchback extends Car{

    public Hatchback(Make make) {
        super(make);
    }

    @Override
    void showDetails() {
        System.out.print("Hatchback: ");
        make.setMake();
    }
}
