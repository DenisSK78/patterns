public class BridgeMain {
    public static void main(String[] args) {
        Program [] programs = {
                new Bank(new JavaDeveloper()),
                new Market(new JavascriptDeveloper())
        };

        for (Program program: programs){
            program.getCode();
        }
    }
}
