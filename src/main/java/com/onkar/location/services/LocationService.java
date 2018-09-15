package com.onkar.location.services;

import java.util.List;

import com.onkar.location.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location getLocationBId(int id);
	List<Location> getAllLocations();
}
