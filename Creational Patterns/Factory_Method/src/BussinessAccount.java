public class BussinessAccount implements BankAccount{

    @Override
    public boolean validateUserIdentity(String user) {
        return false;
    }

    @Override
    public double calculateInterestRate(int num) {
        return 0;
    }

    @Override
    public void registerAccount(String account) {

    }
}
