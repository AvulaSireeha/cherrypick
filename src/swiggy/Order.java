package swiggy;

public abstract class Order implements SwiggyPaymentService {
  public   int localmartchantId=3456787;


  public int orderProcess(Product product){
    int totalBiryaniCost=product.numOfBiryanis*product.biryaniCost;
    int totalStaterCost=product.numOfstarters*product.starterCost;
    int totalDrinksCost=product.numOfDrinks*product.drinkCost;
    int totalAmount=totalStaterCost+totalBiryaniCost+totalDrinksCost;
    System.out.println("total prize =" +totalAmount);
    return totalAmount;
  }


}
