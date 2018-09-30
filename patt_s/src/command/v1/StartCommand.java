package command.v1;

public class StartCommand implements Command {
    private Comp comp;

    StartCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.start();
    }
}
