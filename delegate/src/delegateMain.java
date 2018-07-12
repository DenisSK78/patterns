public class delegateMain {
    public static void main(String[] args) {
        Painter painter = new Painter();

        painter.setGraphics(new Triangle());
        painter.drow();

        painter.setGraphics(new Square());
        painter.drow();

        painter.setGraphics(new Circle());
        painter.drow();
    }
}
