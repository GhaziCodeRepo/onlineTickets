package domain.exercise.bms.service;

import java.util.List;

import domain.exercise.bms.model.Place;

public interface PlaceService {
    List<Place> getAllPlaces();

    Place getPlaceById(Long id);

    Place createPlace(Place place);

    Place updatePlace(Long id, Place updatedPlace);

    boolean deletePlace(Long id);
    List<Place> getLocationsByCity(Long cityId);
}
