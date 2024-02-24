package abstractdemo;

import model.DrivingType;
import model.FuelType;
import model.SoundSystem;

public class SafariBasic extends Car{

    @Override
    public SoundSystem soundSystem() {

        return new SoundSystem("220 watts");
    }

    @Override
    public FuelType fuelType() {
        return new FuelType("petrol");
    }

    @Override
    public DrivingType drivingType() {

        return new DrivingType("manual");
    }
}
