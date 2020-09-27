package com.learning.basics.repositorry;

import java.util.ArrayList;
import java.util.List;

import com.learning.basics.model.Speaker;

public class SpeakerRepositoryImpl implements SpeakerRepository {
	
	@Override
	public List<Speaker> getSpeakers() {
		List<Speaker> speakers = new ArrayList<Speaker>();
		Speaker speaker = new Speaker();
		speaker.setFirstName("Sasi");
		speaker.setLastName("koduru");
		speakers.add(speaker);
		return speakers;
		
	}

}
