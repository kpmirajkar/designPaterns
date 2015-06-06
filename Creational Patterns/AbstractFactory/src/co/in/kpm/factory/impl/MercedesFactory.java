package co.in.kpm.factory.impl;

import co.in.kpm.factory.IVehicalFactory;
import co.in.kpm.model.IBus;
import co.in.kpm.model.ICar;
import co.in.kpm.model.impl.mercedes.A180;
import co.in.kpm.model.impl.mercedes.SkyBus;

public class MercedesFactory implements IVehicalFactory {

  @Override
  public ICar createCar(String type) {
    switch(type) {
      case "A180":
        return new A180();
      default:
        return new UnknownCar();
    }
  }


  @Override
  public IBus createBus(String type) {
    switch(type) {
      case "SkyBus":
        return new SkyBus();
      default:
        return new UnknownBus();
    }
  }

}
