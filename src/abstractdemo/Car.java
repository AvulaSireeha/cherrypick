package abstractdemo;

import model.*;

public abstract class Car {

    public Colour colourName(Colour colour){
        return colour;
    }
    public Engine engineModel(Engine engine){

        return engine;
    }


    public abstract SoundSystem soundSystem();
    public abstract FuelType fuelType();
    public abstract DrivingType drivingType();
}
