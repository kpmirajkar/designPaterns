package co.in.kpm.factory.impl;

import co.in.kpm.model.IBus;
import co.in.kpm.model.IType;
import co.in.kpm.model.impl.VehicalType;

public class UnknownBus implements IBus{
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