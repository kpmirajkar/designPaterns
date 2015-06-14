package co.in.kpm.maker;


/**
 * Director in the builder pattern. Creates the object step by step
 * 
 * @author Krishna Murthy
 *
 */
public class VehicleMaker {

  private final IVehicleBuilder builder;


  public VehicleMaker(IVehicleBuilder builder) {
    this.builder = builder;
  }


  public void makeVehicle() {
    builder.buildChassis();
    builder.buildBody();
    builder.fixTyres();
    builder.applyPaint();
    builder.buildAddOns();
  }

}
