package co.in.kpm.maker;

import co.in.kpm.maker.model.Polo;

public class PoloCarBuilder implements IVehicleBuilder {

  private final Polo polo;


  public PoloCarBuilder() {
    polo = new Polo();
  }


  public Polo getVehicle() {
    return polo;
  }


  @Override
  public void buildChassis() {
    polo.setChassis("Polo Chassis");
  }


  @Override
  public void buildBody() {
    polo.setBody("Polo Body");
  }


  @Override
  public void fixTyres() {
    polo.setTyres("Alloy Wheels 15 inches");
  }


  @Override
  public void applyPaint() {
    polo.setPaint("7 Year warranty. Full body dip paint.");
  }


  @Override
  public void buildAddOns() {
    Polo polo = new Polo();
    polo.setCC(1199);
    polo.setVariant("TDI");
  }

}
