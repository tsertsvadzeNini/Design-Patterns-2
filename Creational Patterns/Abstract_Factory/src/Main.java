public class Main {
    public static void main(String [] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape2 = shapeFactory1.getShape("RoundedSquare");
        shape2.draw();

    }
}
