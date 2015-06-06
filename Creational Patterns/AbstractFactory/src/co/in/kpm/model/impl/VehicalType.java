package co.in.kpm.model.impl;

import co.in.kpm.model.IType;

public enum VehicalType implements IType {
  SEDAN("Sedan"), //
  SUV("Suv"), //
  HATCH_BACK("Hatch Back"), //
  LUXURY_BUS("Luxury"), //
  EXECUTIVE_BUS("Executive bus"),//
  UNKNOWN("Unknown");
  
  private final String typeName;


  private VehicalType(String typeName) {
    this.typeName = typeName;
  }


  @Override
  public IType getType() {
    return this;
  }


  @Override
  public String toString() {
    return typeName;
  }

}
