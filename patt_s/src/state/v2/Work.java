package state.v2;

public class Work implements Activity {
    @Override
    public void doSmth(Human context) {
        System.out.println("Is working!");
        context.setState(new WeekEnd());
    }
}
