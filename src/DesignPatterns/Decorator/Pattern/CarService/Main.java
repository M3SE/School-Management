package DesignPatterns.Decorator.Pattern.CarService;


public class Main {

    public static void main(String[] args) {
        CarService carService = new EngineFix(new OilChange(new OilChange(new TireRotation(new BasicCarService()))));
        System.out.println(carService.getDescription());
        System.out.println(carService.getCost());
    }
}
