package abstractdemo;

import model.DrivingType;
import model.FuelType;
import model.SoundSystem;

public class SafariTopEnd extends Car {

    @Override
    public SoundSystem soundSystem() {
        return new SoundSystem("500watts");
    }

    @Override
    public FuelType fuelType() {
        return new FuelType("diesel");
    }

    @Override
    public DrivingType drivingType() {
        return null;
    }
}
