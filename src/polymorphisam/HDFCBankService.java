package polymorphisam;

public class HDFCBankService extends RBIBankService {
    public double calculateIntrest(int principleAmount) {
        double tatalAmount=0;
        double intrestAmount= super.calculateIntrest(principleAmount);
        tatalAmount=intrestAmount+principleAmount;
        return tatalAmount;
    }
    public double calculateIntrest(int principleAmount,int days){
        double totalAmount=0;
        if(days>89) {
            return calculateIntrest(principleAmount);
        }
        return totalAmount+principleAmount;
    }
}
