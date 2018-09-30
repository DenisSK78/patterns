package command.v2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CommandDemo {

    private static final Map<String, Command> COMMAND_MAP = new HashMap<>();

    static {
        COMMAND_MAP.put("l", new TurnLeftCommand());
        COMMAND_MAP.put("r", new TurnRightCommand());
        COMMAND_MAP.put("f", new MoveForwardCommand());
        COMMAND_MAP.put("b", new MoveBackwardsCommand());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Simulator simulator = new Simulator();
        while (true) {
            String command = scanner.next();
            if (command.equals("rollback")) {
                simulator.rollbackLast();
            } else if (command.equals("exit")) {
                return;
            } else if (!COMMAND_MAP.containsKey(command)){
                System.out.println("No such command!");
            } else {
                simulator.runCommand(COMMAND_MAP.get(command));
            }
        }
    }
}
