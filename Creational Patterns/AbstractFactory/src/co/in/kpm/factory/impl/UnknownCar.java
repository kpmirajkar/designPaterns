package co.in.kpm.factory.impl;

import co.in.kpm.model.ICar;
import co.in.kpm.model.IType;
import co.in.kpm.model.impl.VehicleType;

public class UnknownCar implements ICar{
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
