package abstractdemo;

import model.Colour;
import model.DrivingType;
import model.FuelType;
import model.SoundSystem;

public class Test {
    public static void main(String[] args) {
        Colour colour=new Colour("green");
        Car basicCar=new SafariBasic();
       SoundSystem frequency= basicCar.soundSystem();
        System.out.println("basic car frequency "+frequency);
       DrivingType drive =basicCar.drivingType();
        System.out.println("basic car driving type" +drive);
        System.out.println(basicCar.colourName(colour));




      Car car=new SafariTopEnd();
    SoundSystem sound=car.soundSystem();
       System.out.println("topend car sound" +sound);
       FuelType fuel = car.fuelType();
       System.out.println("topend fuel type "+fuel);
    }
}
