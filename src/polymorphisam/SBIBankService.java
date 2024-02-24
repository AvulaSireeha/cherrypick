package polymorphisam;

public class SBIBankService extends RBIBankService{
    @Override
    public double calculateIntrest(int principleAmount) {
        double tatalAmount=0;
        double intrestAmount= super.calculateIntrest(principleAmount);
         tatalAmount=intrestAmount+principleAmount;
         return tatalAmount;//return double
    }
    public double calculateIntrest(int principleAmount,int days){
        double totalAmount=0;
        if(days>85) {
         return this.calculateIntrest(principleAmount);
        }
       return totalAmount+principleAmount;
    }
}
