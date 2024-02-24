package model;

public class DrivingType {
    public String drivingType;

    public DrivingType(String drivingType) {
        this.drivingType = drivingType;
    }

    @Override
    public String toString() {
        return "DrivingType{" +
                "drivingType='" + drivingType + '\'' +
                '}';
    }
}
