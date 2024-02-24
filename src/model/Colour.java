package model;

public class Colour {
    public String carColour;

    public Colour(String carColour) {
        this.carColour = carColour;
    }

    @Override
    public String toString() {
        return "Colour{" +
                "carColour='" + carColour + '\'' +
                '}';
    }
}
