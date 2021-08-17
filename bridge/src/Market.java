public class Market extends Program{
    public Market(Developer developer) {
        super(developer);
    }

    @Override
    void getCode() {
        System.out.println("Market developer write code...");
        developer.writeProgram();
    }
}
