package co.in.kpm.maker.model;

public class Mercedes implements IVehicle {

  private String name;
  private String manufacturer;
  private IType type;
  private boolean hasAutomaticWeatherControl;
  private boolean hasCruiseControl;
  private boolean hasAutoDrive;
  private boolean hasAC;
  private boolean hasGPS;

  private String chassis;
  private String body;
  private String tyres;
  private String paint;


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public String getName() {
    return name;
  }


  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  @Override
  public String getManufacturer() {
    return manufacturer;
  }


  public void setType(IType type) {
    this.type = type;
  }


  @Override
  public IType getType() {
    return type;
  }


  public boolean hasAutomaticWeatherControl() {
    return hasAutomaticWeatherControl;
  }


  public void setHasAutomaticWeatherControl(boolean flag) {
    this.hasAutomaticWeatherControl = flag;
  }


  public boolean hasCruiseControl() {
    return hasCruiseControl;
  }


  public void setHasCruiseControl(boolean flag) {
    this.hasCruiseControl = flag;
  }


  public boolean hasAutoDrive() {
    return hasAutoDrive;
  }


  public void setHasAutoDrive(boolean flag) {
    this.hasAutoDrive = flag;
  }


  public boolean hasAC() {
    return hasAC;
  }


  public void setHasAC(boolean flag) {
    this.hasAC = flag;
  }


  public boolean hasGPS() {
    return hasGPS;
  }


  public void setHasGPS(boolean flag) {
    this.hasGPS = flag;
  }


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


  @Override
  public String toString() {
    return "Mercedes [name=" + name + ", manufacturer=" + manufacturer + ", type=" + type + ", hasAutomaticWeatherControl="
        + hasAutomaticWeatherControl + ",\n hasCruiseControl=" + hasCruiseControl + ", hasAutoDrive=" + hasAutoDrive + ", hasAC="
        + hasAC + ", hasGPS=" + hasGPS + ", chassis=" + chassis + ", \nbody=" + body + ", tyres=" + tyres + ", paint=" + paint
        + "Manufacturer=" + getManufacturer() + "]";
  }

}
