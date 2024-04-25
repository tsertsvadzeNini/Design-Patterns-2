public abstract class CarDecorator implements Car {
    private final Car car;
    public CarDecorator(Car c) {
        this.car = c;
    }
    @Override
    public void assemble() {
        car.assemble();
    }
}