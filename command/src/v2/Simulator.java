package v2;

import java.util.Deque;
import java.util.LinkedList;


public class Simulator {

    private Deque<Command> performedCommands = new LinkedList<>();

    public void runCommand(Command command) {
        command.run();
        performedCommands.add(command);
    }

    public void rollbackLast() {
        Command command = performedCommands.pollLast();
        if (command != null) {
            command.rollback();
        }
    }
}
