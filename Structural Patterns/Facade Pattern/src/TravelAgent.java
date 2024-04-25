public class TravelAgent {
    private TravelAgency france;
    private TravelAgency italy;
    private TravelAgency germany;

    public TravelAgent(){
        france = new TravelToFrance();
        germany = new TravelToGermany();
        italy = new TravelToItaly();
    }

    public void franceSale(){
        france.tourPrice();
        france.Duration();
    }

    public void germanySale(){
        germany.tourPrice();
        germany.Duration();
    }

    public void italySale(){
        italy.tourPrice();
        italy.Duration();
    }
}
