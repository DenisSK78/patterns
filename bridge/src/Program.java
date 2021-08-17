public abstract class Program {

    protected Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    void getCode(){
        developer.writeProgram();
    }
}
