package swiggy;

public class Product {

    public String starter;
    public int starterCost;
    public  int numOfstarters;
   public String Biryani;
    public int biryaniCost;
    public  int numOfBiryanis;

    public String drinks;
    public int drinkCost;
    public  int numOfDrinks;


    public Product(String starter, int starterCost, int numOfstarters, String biryani,
                   int biryaniCost, int numOfBiryanis, String drinks, int drinkCost, int numOfdrinks) {
        this.starter = "Grill Chicken";
        this.starterCost = 150;
        this.numOfstarters = numOfstarters;
       this. Biryani = "mutton";
        this.biryaniCost =280;
        this.numOfBiryanis = numOfBiryanis;
        this.drinks = "Sprite";
        this.drinkCost = 30;
        this.numOfDrinks = numOfDrinks;
    }
}
