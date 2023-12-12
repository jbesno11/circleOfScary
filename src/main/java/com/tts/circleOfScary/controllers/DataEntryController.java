package com.tts.circleOfScary.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tts.circleOfScary.models.DataEntry;
import com.tts.circleOfScary.repositories.DataEntryRepository;

@RestController
public class DataEntryController {
	
	@Autowired
	DataEntryRepository DERep;
	
	
	//@GetMapping("/")
	//public String testHome() {
	//	return "frontEnd/index.html";
	//}
	
	// create get request that maps to api scalesKeys
	
	@GetMapping("/api/scale/{scale}")
	public DataEntry scalesKeys(@PathVariable String scale) {
		Optional <DataEntry> a = DERep.findBySongKey(scale);
		return a.get();
		
	} 
	
	
	

}
