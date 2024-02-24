package methodOverriding;

public class PhonePayService extends BankAccountService {
    public boolean transfer(String fromMobileNumbere,String toMobileNumber,int amount){
        System.out.println("from sub class BankAccountService");
     return super.transfer(fromMobileNumbere,toMobileNumber,amount);

    }
}