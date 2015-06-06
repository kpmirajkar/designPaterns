package co.in.kpm.factory.impl;

import co.in.kpm.model.IBus;
import co.in.kpm.model.IType;
import co.in.kpm.model.impl.VehicleType;

public class UnknownBus implements IBus{
  @Override
  public IType getType() {
    return VehicleType.UNKNOWN;
  }
  
  
  @Override
  public String getName() {
    return VehicleType.UNKNOWN.toString();
  }
  
  
  @Override
  public String getManufacturer() {
    return VehicleType.UNKNOWN.toString();
  }
}
