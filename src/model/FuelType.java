package model;

public class FuelType {
    public String typeOfFuel;

    public FuelType(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "typeOfFuel='" + typeOfFuel + '\'' +
                '}';
    }
}
