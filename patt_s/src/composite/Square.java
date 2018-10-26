package composite;

public class Square implements Shape {

    String forSmall;

    public String getForSmall() {
        return forSmall;
    }

    public void setForSmall(String forSmall) {
        this.forSmall = forSmall;
    }

    @Override
    public void draw() {
        System.out.println("It is square. " + forSmall);
    }
}
