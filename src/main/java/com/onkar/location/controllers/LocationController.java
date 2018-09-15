package com.onkar.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onkar.location.entities.Location;
import com.onkar.location.services.LocationService;

@Controller
public class LocationController {

	@Autowired
	private LocationService locationService;
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSaved = locationService.saveLocation(location);
		String message = "Location saved for id: " + locationSaved.getId();
		modelMap.addAttribute("Message", message);
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displaLocations(ModelMap modelMap) {
		List<Location> locations = locationService.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
}
