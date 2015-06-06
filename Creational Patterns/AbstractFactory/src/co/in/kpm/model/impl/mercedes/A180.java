package co.in.kpm.model.impl.mercedes;

import co.in.kpm.model.ICar;
import co.in.kpm.model.IType;
import co.in.kpm.model.impl.VehicleType;

public class A180 implements ICar {

  @Override
  public String getName() {
    return "A180";
  }


  @Override
  public String getManufacturer() {
    return "Mercedes";
  }


  @Override
  public IType getType() {
    return VehicleType.HATCH_BACK;
  }

}
