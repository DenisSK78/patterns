package v1;

public class stateMain {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setStation(new RadioVesti());

        for (int i = 0; i < 6; i++) {
            radio.nextStation();

            radio.play();
        }
    }
}
