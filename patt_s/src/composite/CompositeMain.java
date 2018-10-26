package composite;

public class CompositeMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        Circle smallCircle = new Circle();
        smallCircle.setForSmall("small");
        Square smallSquare = new Square();
        smallSquare.setForSmall("small");

        Composite smallComposite = new Composite();
        Composite bigComposite = new Composite();

        smallComposite.addComponent(smallSquare);
        smallComposite.addComponent(smallCircle);

        bigComposite.addComponent(smallComposite);
        bigComposite.addComponent(circle);
        bigComposite.addComponent(square);
        bigComposite.addComponent(triangle);

        bigComposite.draw();

    }
}
