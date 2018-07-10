package v2;

public class stateMain2 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Work());
        for (int i = 0; i <12 ; i++) {
            human.go();
        }
    }
}
