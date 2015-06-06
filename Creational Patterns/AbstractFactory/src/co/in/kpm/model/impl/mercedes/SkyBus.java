package co.in.kpm.model.impl.mercedes;

import co.in.kpm.model.IBus;
import co.in.kpm.model.IType;
import co.in.kpm.model.impl.VehicalType;

public class SkyBus implements IBus {

	@Override
	public String getName() {
		return "SkyBus";
	}

	@Override
	public String getManufacturer() {
		return "Mercedes";
	}
	
	@Override
	public IType getType() {
	  return VehicalType.LUXURY_BUS;
	}

}
