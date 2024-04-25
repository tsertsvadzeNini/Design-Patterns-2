public class Main {
    public static void main(String[] args) {
        // basic real car
        Car realCar = new RealCar();
        realCar.assemble();
        System.out.println("\n*****");
// real sports car
        Car sportsCar = new SportsDecorator(new RealCar());
        sportsCar.assemble();
        System.out.println("\n*****");
// real sports car with luxury interior
        Car sportsLuxuryCar = new SportsDecorator(new LuxuryDecorator(new RealCar()));
        sportsLuxuryCar.assemble();
        System.out.println("\n*****");
// real painted car with luxury interior and sports mode
        Car sportsLuxuryPaintedCar = new SportsDecorator(new LuxuryDecorator(new PaintDecorator(new RealCar())));
        sportsLuxuryPaintedCar.assemble();
        System.out.println("\n*****");
// real painted luxury car
        Car luxuryPaintedCar = new LuxuryDecorator(new PaintDecorator(new RealCar()));
        luxuryPaintedCar.assemble();
        System.out.println("\n*****");
// painted toy car
        Car paintedToyCar = new PaintDecorator(new ToyCar());
        paintedToyCar.assemble();
        System.out.println("\n*****");
    }
}