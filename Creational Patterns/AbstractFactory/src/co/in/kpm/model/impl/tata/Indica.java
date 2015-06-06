package co.in.kpm.model.impl.tata;

import co.in.kpm.model.ICar;
import co.in.kpm.model.IType;
import co.in.kpm.model.impl.VehicleType;

public class Indica implements ICar {

	@Override
	public String getName() {
		return "Indica";
	}

	@Override
	public String getManufacturer() {
		return "Tata";
	}

	@Override
	public IType getType() {
	  return VehicleType.HATCH_BACK;
	}
}
