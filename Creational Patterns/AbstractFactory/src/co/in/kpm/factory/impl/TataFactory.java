package co.in.kpm.factory.impl;

import co.in.kpm.factory.IVehicalFactory;
import co.in.kpm.model.IBus;
import co.in.kpm.model.ICar;
import co.in.kpm.model.impl.tata.Indica;
import co.in.kpm.model.impl.tata.StarBus;

public class TataFactory implements IVehicalFactory {

  @Override
  public ICar createCar(String type) {
    switch(type) {
      case "Indica":
        return new Indica();
      default:
        return new UnknownCar();
    }
  }


  @Override
  public IBus createBus(String type) {
    switch(type) {
      case "StarBus":
        return new StarBus();
      default:
        return new UnknownBus();
    }
  }

}