package methodOverriding;

public class MethodOverrideTest {
    public static void main(String[] args){
        PhonePayService phonePayService=new PhonePayService();
        phonePayService.transfer("12345","45678",100);
        phonePayService.transfer("12345","45678",100);
        phonePayService.transfer("12345","45678",100);
        System.out.println("to account Amount = " +phonePayService.toAccountAmt);

        BankAccountService bankAccountService=new BankAccountService();
        bankAccountService.transfer("12345","45678",100);
        System.out.println("to account Amount = " +bankAccountService.toAccountAmt);

        System.out.println("from account Amount = " +bankAccountService.fromAccountAmt);

    }
}
