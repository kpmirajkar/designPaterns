package co.in.kpm.model.impl.tata;

import co.in.kpm.model.IBus;
import co.in.kpm.model.IType;
import co.in.kpm.model.impl.VehicleType;

public class StarBus implements IBus {

  @Override
  public String getName() {
    return "StarBus";
  }


  @Override
  public String getManufacturer() {
    return "Tata";
  }


  @Override
  public IType getType() {
    return VehicleType.EXECUTIVE_BUS;
  }
}
