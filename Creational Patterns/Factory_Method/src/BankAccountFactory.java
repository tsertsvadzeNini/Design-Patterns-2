public class BankAccountFactory {
    public BankAccount createAccount(String account){
        if(account == null){
            return null;
        }
        if(account.equals("BussinessAccount")){
            return  new BussinessAccount();
        }
        if(account.equals("CheckingAccount")){
            return  new CheckingAccount();
        }
        if(account.equals("PersonalAccount")){
            return  new PersonalAcoount();
        }
        return null;
    }
}
