package co.in.kpm.maker;

import co.in.kpm.maker.model.Mercedes;
import co.in.kpm.maker.model.VehicleType;

public class MercedesCarBuilder implements IVehicleBuilder {
  private final Mercedes mercedes;


  public MercedesCarBuilder() {
    mercedes = new Mercedes();
  }


  public Mercedes getVehicle() {
    return mercedes;
  }


  @Override
  public void buildChassis() {
    mercedes.setChassis("Mercedes Chassis");
  }


  @Override
  public void buildBody() {
    mercedes.setBody("Mercedes Body");
  }


  @Override
  public void fixTyres() {
    mercedes.setTyres("Mercedes 17 inch tyres");
  }


  @Override
  public void applyPaint() {
    mercedes.setPaint("Mercedes paint");
  }


  @Override
  public void buildAddOns() {
    mercedes.setType(VehicleType.SEDAN);
    mercedes.setHasAC(true);
    mercedes.setHasAutoDrive(true);
    mercedes.setHasCruiseControl(true);
    mercedes.setHasGPS(true);
    mercedes.setManufacturer("Mercedes Benz");
    mercedes.setName("S600");
  }

}
