import java.util.List;

public interface BankAccount {
    //public static List<String>;
    public boolean validateUserIdentity(String user);
    public double calculateInterestRate(int num);
    public  void registerAccount(String account);
}
