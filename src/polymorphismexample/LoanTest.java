package polymorphismexample;

import polymorphisam.SBIBankService;

public class LoanTest {
    public static void main(String[] args) {
//        HDFCService homeLoan=new HDFCService();
//        double a=homeLoan.processingFeeCal(100000);
//        System.out.println("hdfc:" +a);
//        SbiService loan=new SbiService();
//        double b=loan.processingFeeCal(100000);
//        System.out.println(b);


        HomeLoan homeLoan = new HomeLoan();
        double emi = homeLoan.emiPlanning(1, 100000);
        System.out.println(emi);
//        SBIBankService sbiBankService=new SBIBankService();
//       double sbi= sbiBankService.calculateIntrest(500000);
//
//        System.out.println("total amount "+sbi);
    }
}