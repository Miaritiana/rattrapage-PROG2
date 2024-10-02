package org.example;

import org.example.model.Apartment;
import org.example.model.Neighborhood;
import org.example.model.Place;

public class Features {
  public static boolean isInNeighborhood(Neighborhood neighborhood, Apartment apartment) {
    if (apartment.getPlace().getName() == neighborhood.getName()) {
      return true;
    }
    return false;
  }

  public static int getApartmentNumber(Place place) {

  }
}
