package co.in.kpm.factory;

import co.in.kpm.model.IBus;
import co.in.kpm.model.ICar;

public interface IVehicalFactory {
	ICar createCar(String type);

	IBus createBus(String type);
}
