package methodOverriding;

public class BankAccountService {
    int fromAccountAmt=1000;
    int toAccountAmt=0;
    String fromAccount=null;
    String toAccount=null;
    public boolean login(String userName,String passWord){

        return true;
    }
    public boolean transfer(String fromMobileNumbere,String toMobileNumber,int amount){
        System.out.println("from super class BankAccountService");

        if(fromMobileNumbere.equals("12345")){
            fromAccount="111";

        }
        if(toMobileNumber.equals("45678")){
            toAccount="222";

        }
       return this.bookTransfer(fromAccount,toAccount,amount);
    }
    public boolean bookTransfer(String fromAccount,String toAccount,int amount){
        toAccountAmt=toAccountAmt+amount;
        fromAccountAmt=fromAccountAmt-amount;
        return true;

    }
}
