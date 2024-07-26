package DesignPatterns.Factory;


public class WaterDrowingBike extends Bike {
    @Override
    public String getDescription() {
        return "Water Drowing Bike";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
