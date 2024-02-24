package polymorphismexample;

public class HDFCLoan extends HomeLoan{
    @Override
    public double processingFeeCal(int loanAmount) {
        if(loanAmount<=500000){
            super.setProcessingRate(1.5);
        } else if (loanAmount<=1000000) {
            super.setProcessingRate(1.0);
        }else{
            super.setProcessingRate(0.5);
        }
        return super.processingFeeCal(loanAmount);
    }
    @Override
    public double emiPlanning(int years,double principalAmount){
        super.setInterest(8);
        return super.emiPlanning(years, principalAmount);
    }
}
