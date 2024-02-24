package interfacedemo;

public class HDFCBankService implements RBIBankService{
    @Override
    public String transfer(String fromAccountNum, String toAccountNum, int amount) {
        return "tranfer from HDFCBank";
    }
}
