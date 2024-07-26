package DesignPatterns.Decorator.Pattern.CarService;

public class EngineFix implements CarService {
    CarService carService;

    public EngineFix(CarService carService) {
        this.carService = carService;
    }

    @Override
    public String getDescription() {
        return carService.getDescription() + ", EngineFix";
    }

    @Override
    public int getCost() {
        return carService.getCost() +50;
    }
}
