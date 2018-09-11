package v2;


public class MoveForwardCommand implements Command {
    @Override
    public void run() {
        System.out.println("Moving forward");
    }

    @Override
    public void rollback() {
        System.out.println("Rollback: moving backwards");
    }
}
