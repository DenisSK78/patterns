package command.v1;

public class StopCommand implements Command{
    private Comp comp;

    StopCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.stop();
    }
}
