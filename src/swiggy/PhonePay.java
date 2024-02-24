package swiggy;

public class PhonePay extends Order{

public int accountBal=2000;

public int txtId;
//    public boolean transfer(String fromMobileNumbere,String toMobileNumber,int amount){
//        System.out.println("from sub class BankAccountService");
//        return super.transfer(fromMobileNumbere,toMobileNumber,amount);
//
//    }
   public int orderProcess(Product product){
    return super.orderProcess(product);
    }
@Override
 public    int payment(int transactionId, int marchantId) {

        if(transactionId==txtId && marchantId==localmartchantId){
            //int availableBalance = accountBal-;
            System.out.println("conform the order");
        }else{
            System.out.println("order failed");
        }
        return 0;
    }
}
