package FactoryCreationalPattern;

public class FactoryPatternDemo {
    public static void main ( String[] args ) {

        ShapeFactory shapeFactory = new ShapeFactory ();
        // get an object of circle and call its draw method
        Shape shape1 = shapeFactory.getShape ("circle");
        // call draw method of circle
        shape1.draw ();

        // get an object of Square and call its draw method
        Shape shape2 = shapeFactory.getShape ("square");
        // call draw method of circle
        shape2.draw ();

        // get an object of Rectangle and call its draw method
        Shape shape3 = shapeFactory.getShape ("rectangle");
        // call draw method of circle
        shape3.draw ();

    }
}
