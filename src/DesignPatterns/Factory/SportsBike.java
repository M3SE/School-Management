package DesignPatterns.Factory;


public class SportsBike extends Bike {
    @Override
    public String getDescription() {
        return "SportsBike";
    }

    @Override
    public int getCost() {
        return 660;
    }
}
