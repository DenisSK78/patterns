package v2;


public class TurnRightCommand implements Command {
    @Override
    public void run() {
        System.out.println("Turning right");
    }

    @Override
    public void rollback() {
        System.out.println("Rollback: turning left");
    }
}
