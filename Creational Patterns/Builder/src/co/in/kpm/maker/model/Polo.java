package co.in.kpm.maker.model;

public class Polo implements IVehicle {

  private int cc;
  private String variant;
  private String chassis;
  private String body;
  private String tyres;
  private String paint;


  public void setPaint(String paint) {
    this.paint = paint;
  }


  public String getPaint() {
    return paint;
  }


  public void setTyres(String tyres) {
    this.tyres = tyres;
  }


  public String getTyres() {
    return tyres;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public String getBody() {
    return body;
  }


  public void setChassis(String chassis) {
    this.chassis = chassis;
  }


  public String getChassis() {
    return chassis;
  }


  public void setCC(int cc) {
    this.cc = cc;
  }


  public int getCC() {
    return cc;
  }


  public void setVariant(String variant) {
    this.variant = variant;
  }


  public String getVariant() {
    return variant;
  }


  @Override
  public String getName() {
    return "Polo";
  }


  @Override
  public String getManufacturer() {
    return "Volkswagon";
  }


  @Override
  public IType getType() {
    return VehicleType.HATCH_BACK;
  }


  @Override
  public String toString() {
    return "Polo [cc=" + cc + ", variant=" + variant + ", chassis=" + chassis + ",\n body=" + body + ", tyres=" + tyres
        + ", paint=" + paint + "\nManufacturer=" + getManufacturer() + ", Type=" + getType() + ", name= " + getName() + "]";
  }
}
