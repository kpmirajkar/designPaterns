package co.in.kpm;

import co.in.kpm.maker.MercedesCarBuilder;
import co.in.kpm.maker.PoloCarBuilder;
import co.in.kpm.maker.VehicleMaker;
import co.in.kpm.maker.model.Mercedes;
import co.in.kpm.maker.model.Polo;

/**
 * 
 * Director that drives the object creation using a builder The manufactured
 * objects generally are so distinct that they don't share a common abstraction.
 * 
 * @author Krishna Murthy P Mirajkar
 *
 */
public class Client {
  public static void main(String[] args) {
    System.out.println("Build a Mercedes car");
    MercedesCarBuilder mercBuilder = new MercedesCarBuilder();
    VehicleMaker maker = new VehicleMaker(mercBuilder);
    maker.makeVehicle();
    Mercedes mercedes = mercBuilder.getVehicle();
    System.out.println(mercedes);

    System.out.println("Build a Polo car");
    PoloCarBuilder poloBuilder = new PoloCarBuilder();
    maker = new VehicleMaker(poloBuilder);
    maker.makeVehicle();
    Polo polo = poloBuilder.getVehicle();
    System.out.println(polo);
  }
}
