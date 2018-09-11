package v2;


public class MoveBackwardsCommand implements Command {
    @Override
    public void run() {
        System.out.println("Moving backwards");
    }

    @Override
    public void rollback() {
        System.out.println("Rollback: moving forward");
    }
}
