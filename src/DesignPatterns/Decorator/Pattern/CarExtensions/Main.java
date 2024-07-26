package DesignPatterns.Decorator.Pattern.CarExtensions;


public class Main {
    public static void main(String[] args) {

        CarExtension extension  = new RearCamera(new CushionSeat
                (new CushionSeat(new MusicSystem(new BasicCar()))));
        System.out.println(extension.getDescription());
        System.out.println(extension.getCost());


    }


}
