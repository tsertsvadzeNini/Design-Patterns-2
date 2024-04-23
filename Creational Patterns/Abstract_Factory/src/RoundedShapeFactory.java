public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("RoundedRectangle")){
            return new RoundedRectangle();
        }
        if(shape.equalsIgnoreCase("RoundedSquare")){
            return new RoundedSquare();
        }
        return null;
    }
}
