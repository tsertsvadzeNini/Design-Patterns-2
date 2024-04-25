public class TravelToFrance implements TravelAgency{
    @Override
    public void tourPrice() {
        System.out.println("800$");
    }

    @Override
    public void Duration() {
        System.out.println("3 days");
    }
}