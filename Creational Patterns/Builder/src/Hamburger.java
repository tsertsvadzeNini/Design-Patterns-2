public class Hamburger implements Item{
    @Override
    public String getName() {
        return "Hamburger";
    }

    @Override
    public Double getPrice() {
        return 7.9;
    }
}
