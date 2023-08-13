package domain.exercise.bms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.exercise.bms.model.Place;
import domain.exercise.bms.repository.PlaceRepository;
import domain.exercise.bms.service.PlaceService;

@Service
public class PlaceServiceImpl implements PlaceService {

    private final PlaceRepository placeRepository;

    @Autowired
    public PlaceServiceImpl(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @Override
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }

    @Override
    public Place getPlaceById(Long id) {
        Optional<Place> optionalPlace = placeRepository.findById(id);
        return optionalPlace.orElse(null);
    }

    @Override
    public Place createPlace(Place place) {
        return placeRepository.save(place);
    }

    @Override
    public Place updatePlace(Long id, Place updatedPlace) {
        Optional<Place> optionalPlace = placeRepository.findById(id);
        if (optionalPlace.isPresent()) {
            Place place = optionalPlace.get();
            place.setName(updatedPlace.getName());
           // place.setParentPlaceId(updatedPlace.getParentPlaceId());
           // place.setPlaceType(updatedPlace.getPlaceType());
            return placeRepository.save(place);
        }
        return null;
    }

    @Override
    public boolean deletePlace(Long id) {
        Optional<Place> optionalPlace = placeRepository.findById(id);
        if (optionalPlace.isPresent()) {
            placeRepository.delete(optionalPlace.get());
            return true;
        }
        return false;
    }

	@Override
	public List<Place> getLocationsByCity(Long cityId) {
		// TODO Auto-generated method stub
		return null;
	}
}
