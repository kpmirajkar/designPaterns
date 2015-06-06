package co.in.kpm.factory;

import co.in.kpm.factory.impl.MercedesFactory;
import co.in.kpm.factory.impl.TataFactory;

public class Factory {

	private Factory() {
	}

	private static final class CreatorHolder {
		private static final Factory CREATOR = new Factory();
	}

	public static final Factory getInstance() {
		return CreatorHolder.CREATOR;
	}

	private static final class MercedesFactoryHolder {
		private static final IVehicalFactory FACTORY = new MercedesFactory();
	}

	public IVehicalFactory getMercedesFactory() {
		return MercedesFactoryHolder.FACTORY;
	}

	private static final class TataFactoryHolder {
		private static final IVehicalFactory FACTORY = new TataFactory();
	}

	public IVehicalFactory getTataFactory() {
		return TataFactoryHolder.FACTORY;
	}

}
