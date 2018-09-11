package v2;


public interface Command {

    void run();

    void rollback();
}
