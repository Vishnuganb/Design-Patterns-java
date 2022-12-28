package FactoryCreationalPattern;

public class ShapeFactory {
    //Use getShape method to get object type shape
    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }
        else if(shapeType.equalsIgnoreCase ("CIRCLe")){
            return new Circle ();
        }
        else if(shapeType.equalsIgnoreCase ("RECTANGLE")){
            return new Rectangle ();
        }
        else if(shapeType.equalsIgnoreCase ("SQUARE")){
            return new Square ();
        }

        return null;

    }
}
