public class Bank extends Program{
    public Bank(Developer developer) {
        super(developer);
    }

    @Override
    void getCode() {
        System.out.println("Bank developers work....");
        developer.writeProgram();
    }
}
