package v2;

public class WeekEnd implements Activity {
    private int count = 0;
    @Override
    public void doSmth(Human context) {
        if (count < 3){
            System.out.println("Ralax!");
            count++;
        }else {
            context.setState(new Work());
        }
    }
}
