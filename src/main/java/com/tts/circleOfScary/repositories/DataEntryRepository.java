package com.tts.circleOfScary.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tts.circleOfScary.models.DataEntry;

public interface DataEntryRepository extends CrudRepository<DataEntry, Long> {
	
	@Override
	Optional<DataEntry> findById(Long id);
	
	@Override
	List<DataEntry> findAll();
	

	Optional<DataEntry> findBySongKey(String key);

}
