package DesignPatterns.Decorator.Pattern.CarService;


public class OilChange implements CarService {
    CarService carService;

    public OilChange(CarService carService) {
        this.carService = carService;
    }

    @Override
    public String getDescription() {
        return carService.getDescription() + ", OilChange";
    }

    @Override
    public int getCost() {
        return carService.getCost() + 10;
    }
}
