package co.in.kpm.factory.impl;

import co.in.kpm.model.ICar;
import co.in.kpm.model.IType;
import co.in.kpm.model.impl.VehicalType;

public class UnknownCar implements ICar{
  @Override
  public IType getType() {
    return VehicalType.UNKNOWN;
  }
  
  
  @Override
  public String getName() {
    return VehicalType.UNKNOWN.toString();
  }
  
  
  @Override
  public String getManufacturer() {
    return VehicalType.UNKNOWN.toString();
  }
}
