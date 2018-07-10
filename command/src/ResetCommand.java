public class ResetCommand implements Command{
    private Comp comp;

    ResetCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.reset();
    }
}
