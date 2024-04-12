package string;

import java.text.MessageFormat;

public class Car {
  private String color;
  private String gearTyep;
  private int doorCount;

  public Car(String color, String gearTyep, int doorCount) {
    this.color = color;
    this.gearTyep = gearTyep;
    this.doorCount = doorCount;
  }

  public String returnColor() {
    return this.color;
  }

  public String returnGearType() {
    return this.gearTyep;
  }

  public int returnDoorCount() {
    return this.doorCount;
  }

  public String returnInfo() {
    String msg = MessageFormat.format("Color : {0} | GearType : {1} | Door : {2}", color,gearTyep,doorCount);
    return msg;
  }
}
