package v2;


public class TurnLeftCommand implements Command {
    @Override
    public void run() {
        System.out.println("Turning left");
    }

    @Override
    public void rollback() {
        System.out.println("Rollback: turning right");
    }
}
