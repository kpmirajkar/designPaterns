package co.in.kpm.client;

import co.in.kpm.factory.Factory;
import co.in.kpm.factory.IVehicalFactory;
import co.in.kpm.model.IVehicle;

public class Client {

  public static void main(String[] args) {
    IVehicalFactory factory = Factory.getInstance().getMercedesFactory();
    IVehicle v = factory.createBus("SkyBus");
    System.out.println("Manufacturer: " + v.getManufacturer() + ", Type: " + v.getType() + ", Vehicle Name:" + v.getName());
    v = factory.createCar("A180");
    System.out.println("Manufacturer: " + v.getManufacturer() + ", Type: " + v.getType() + ", Vehicle Name:" + v.getName());

    factory = Factory.getInstance().getTataFactory();
    v = factory.createBus("StarBus");
    System.out.println("Manufacturer: " + v.getManufacturer() + ", Type: " + v.getType() + ", Vehicle Name:" + v.getName());
    v = factory.createCar("Indica");
    System.out.println("Manufacturer: " + v.getManufacturer() + ", Type: " + v.getType() + ", Vehicle Name:" + v.getName());
  }
}
