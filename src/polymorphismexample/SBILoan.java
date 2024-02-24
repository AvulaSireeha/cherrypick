package polymorphismexample;

public class SBILoan extends HomeLoan{
    double processingRate;

    @Override
    public double processingFeeCal(int loanAmount) {
        if(loanAmount<=500000){
            super.setProcessingRate(2.0);
        } else if (loanAmount<=1000000) {
            super.setProcessingRate(1.5);
        }else{
            super.setProcessingRate(1.0);
        }
        return super.processingFeeCal(loanAmount);
    }
    @Override
    public double emiPlanning(int years,double principalAmount){
        super.setInterest(8.5);
        return super.emiPlanning(years, principalAmount);
    }
}
