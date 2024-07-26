package DesignPatterns.Decorator.Pattern.CarService;


public class TireRotation implements CarService {
    CarService carService;
    public TireRotation(CarService carService) {
        this.carService = carService;
    }

    @Override
    public String getDescription() {
        return carService.getDescription()+ ", Tire Rotation";
    }

    @Override
    public int getCost() {
        return carService.getCost() + 20;
    }
}
