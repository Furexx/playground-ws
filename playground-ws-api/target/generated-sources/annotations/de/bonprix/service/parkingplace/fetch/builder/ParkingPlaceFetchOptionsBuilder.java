package de.bonprix.service.parkingplace.fetch.builder;

import de.bonprix.service.parkingplace.fetch.ParkingPlaceFetchOptions;
import javax.annotation.processing.Generated;
import net.karneim.pojobuilder.GwtIncompatible;

@Generated("PojoBuilder")
public class ParkingPlaceFetchOptionsBuilder
    implements Cloneable {
  protected ParkingPlaceFetchOptionsBuilder self;
  protected boolean value$fetchCar$boolean;
  protected boolean isSet$fetchCar$boolean;

  /**
   * Creates a new {@link ParkingPlaceFetchOptionsBuilder}.
   */
  public ParkingPlaceFetchOptionsBuilder() {
    self = (ParkingPlaceFetchOptionsBuilder)this;
  }

  /**
   * Sets the default value for the fetchCar property.
   *
   * @param value the default value
   * @return this builder
   */
  public ParkingPlaceFetchOptionsBuilder withFetchCar(boolean value) {
    this.value$fetchCar$boolean = value;
    this.isSet$fetchCar$boolean = true;
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
      ParkingPlaceFetchOptionsBuilder result = (ParkingPlaceFetchOptionsBuilder)super.clone();
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
  public ParkingPlaceFetchOptionsBuilder but() {
    return (ParkingPlaceFetchOptionsBuilder)clone();
  }

  /**
   * Creates a new {@link ParkingPlaceFetchOptions} based on this builder's settings.
   *
   * @return the created ParkingPlaceFetchOptions
   */
  public ParkingPlaceFetchOptions build() {
    try {
      ParkingPlaceFetchOptions result = new ParkingPlaceFetchOptions();
      if (isSet$fetchCar$boolean) {
        result.setFetchCar(value$fetchCar$boolean);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }
}
