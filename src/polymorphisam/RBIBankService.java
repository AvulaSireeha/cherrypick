package polymorphisam;

public class RBIBankService {
    public double calculateIntrest(int principleAmount){
      int duration=3;//year=0.25
      double intrest=principleAmount*0.25*2.4/100;
      return intrest;
    }
}
