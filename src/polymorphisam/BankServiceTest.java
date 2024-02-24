package polymorphisam;

public class BankServiceTest {
    public static void main(String[] args){
        SBIBankService sbiBankService=new SBIBankService();
        double sbiBankIntrest=sbiBankService.calculateIntrest(1000,86);
        System.out.println("SBI Bank "+sbiBankIntrest);

        HDFCBankService hdfcBankService=new HDFCBankService();
        double hdfcBankIntrest=hdfcBankService.calculateIntrest(1000,88);
        System.out.println(" HDFC Bank "+hdfcBankIntrest);
    }
}
