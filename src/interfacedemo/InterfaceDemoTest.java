package interfacedemo;

public class InterfaceDemoTest {
    public static void main(String[] args){
        RBIBankService hdfcBankService=new HDFCBankService();
        RBIBankService sbiBankService=new SBIBankService();
       String hdfcStatus= hdfcBankService.transfer("456876","67890",1000);
       String sbiStatus= sbiBankService.transfer("234567","456789",5000);
        System.out.println(hdfcStatus);
        System.out.println(sbiStatus);
    }
}
