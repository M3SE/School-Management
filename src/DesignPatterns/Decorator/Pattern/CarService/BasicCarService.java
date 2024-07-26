package DesignPatterns.Decorator.Pattern.CarService;


public class BasicCarService implements CarService {

    @Override
    public String getDescription() {
        return "Basic Car Service";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
