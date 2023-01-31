package de.bonprix.dto.builder;

import de.bonprix.dto.Car;
import de.bonprix.dto.ParkingPlace;
import javax.annotation.processing.Generated;
import net.karneim.pojobuilder.GwtIncompatible;

@Generated("PojoBuilder")
public class CarBuilder
    implements Cloneable {
  protected CarBuilder self;
  protected Long value$id$java$lang$Long;
  protected boolean isSet$id$java$lang$Long;
  protected String value$plateNumber$java$lang$String;
  protected boolean isSet$plateNumber$java$lang$String;
  protected ParkingPlace value$parkingPlace$de$bonprix$dto$ParkingPlace;
  protected boolean isSet$parkingPlace$de$bonprix$dto$ParkingPlace;

  /**
   * Creates a new {@link CarBuilder}.
   */
  public CarBuilder() {
    self = (CarBuilder)this;
  }

  /**
   * Sets the default value for the id property.
   *
   * @param value the default value
   * @return this builder
   */
  public CarBuilder withId(Long value) {
    this.value$id$java$lang$Long = value;
    this.isSet$id$java$lang$Long = true;
    return self;
  }

  /**
   * Sets the default value for the plateNumber property.
   *
   * @param value the default value
   * @return this builder
   */
  public CarBuilder withPlateNumber(String value) {
    this.value$plateNumber$java$lang$String = value;
    this.isSet$plateNumber$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the parkingPlace property.
   *
   * @param value the default value
   * @return this builder
   */
  public CarBuilder withParkingPlace(ParkingPlace value) {
    this.value$parkingPlace$de$bonprix$dto$ParkingPlace = value;
    this.isSet$parkingPlace$de$bonprix$dto$ParkingPlace = true;
    return self;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  @GwtIncompatible
  public Object clone() {
    try {
      CarBuilder result = (CarBuilder)super.clone();
      result.self = result;
      return result;
    } catch (CloneNotSupportedException e) {
      throw new InternalError(e.getMessage());
    }
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @GwtIncompatible
  public CarBuilder but() {
    return (CarBuilder)clone();
  }

  /**
   * Creates a new {@link Car} based on this builder's settings.
   *
   * @return the created Car
   */
  public Car build() {
    try {
      Car result = new Car();
      if (isSet$id$java$lang$Long) {
        result.setId(value$id$java$lang$Long);
      }
      if (isSet$plateNumber$java$lang$String) {
        result.setPlateNumber(value$plateNumber$java$lang$String);
      }
      if (isSet$parkingPlace$de$bonprix$dto$ParkingPlace) {
        result.setParkingPlace(value$parkingPlace$de$bonprix$dto$ParkingPlace);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }
}
