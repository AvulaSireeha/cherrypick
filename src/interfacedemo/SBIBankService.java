package interfacedemo;

public class SBIBankService implements RBIBankService{
    @Override
    public String transfer(String fromAccountNum, String toAccountNum, int amount) {
        return "tranfer from SBIBank";
    }
}
