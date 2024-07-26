package DesignPatterns.Factory;


public class BikeFactory {
    public static Bike createBike(String bikeName){
        Bike bike=null;
        if(bikeName.equalsIgnoreCase("DirtyBike"))
            bike = new DirtBike();
        else if(bikeName.equalsIgnoreCase("SkyFlyingBike"))
            bike = new SkyFlyingBike();
        else if(bikeName.equalsIgnoreCase("SportsBike"))
            bike = new SportsBike();
        else if(bikeName.equalsIgnoreCase("WaterDrowingBike"))
            bike = new WaterDrowingBike();

      return bike;
    }

}
