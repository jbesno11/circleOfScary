package com.tts.circleOfScary.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.hibernate.validator.constraints.Length;


//this is the class I used to read my data into the h2 database

@Entity 
public class DataEntry {
	
	
	//primary key creation is handled is done by SpringBoot
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Length(min =1, max =5)
	private String songKey;
	
	@Length(min =1)
	private String chordsInKeyMajor;
	
	@Length(min =1)
	private String chordsInKeyMinor;
	
	@Length(min =1)
	private String majorScale;
	
	@Length(min =1)
	private String dorianScale;
	
	@Length(min =1)
	private String phrygianScale;
	
	@Length(min =1)
	private String lydianScale;
	
	@Length(min =1)
	private String mixolydianScale;
	
	@Length(min =1)
	private String minorScale;
	
	@Length(min =1)
	private String locrianScale;
	
	@Length(min =1)
	private String popularSongsInKey;
	
	@Length(min =0, max = 7)
	private int numberOfSharps;
	
	@Length(min =0, max = 7)
	private int numberOfFlats;
	











public DataEntry() {}
	
	
	public DataEntry(String songKey, String chordsInKeyMajor, String chordsInKeyMinor, String majorScale, 
			String dorianScale, String phrygianScale, String lydianScale, String mixolydianScale, 
			String minorScale, String locrianScale, String popularSongsInKey, int numberOfSharps, int numberOfFlats) {
		
		
		this.songKey = songKey; 
		this.chordsInKeyMajor = chordsInKeyMajor;
		this.chordsInKeyMinor = chordsInKeyMinor; 
		this.majorScale = majorScale; 
		this.dorianScale = dorianScale;
		this.phrygianScale = phrygianScale;
		this.lydianScale =lydianScale;
		this.mixolydianScale = mixolydianScale; 
		this.minorScale = minorScale;
		this.locrianScale =locrianScale;
		this.popularSongsInKey = popularSongsInKey;
		this.numberOfSharps =numberOfSharps;
		this.numberOfFlats = numberOfFlats;
		
		
		
	}

	
	//i only want users to read from the data base 
	//not update it in any way so i only got getters

	public Long getId() {
		return id;
	}


	public String getSongKey() {
		return songKey;
	}


	public String getChordsInKeyMajor() {
		return chordsInKeyMajor;
	}


	public String getChordsInKeyMinor() {
		return chordsInKeyMinor;
	}


	public String getMajorScale() {
		return majorScale;
	}


	public String getDorianScale() {
		return dorianScale;
	}


	public String getPhrygianScale() {
		return phrygianScale;
	}


	public String getLydianScale() {
		return lydianScale;
	}


	public String getMixolydianScale() {
		return mixolydianScale;
	}


	public String getMinorScale() {
		return minorScale;
	}


	public String getLocrianScale() {
		return locrianScale;
	}


	public String getPopularSongsInKey() {
		return popularSongsInKey;
	}


	public int getNumberOfSharps() {
		return numberOfSharps;
	}


	public int getNumberOfFlats() {
		return numberOfFlats;
	}
	
	public String toStringMajor() {
		return "You have selected " + this.songKey + "  Major \n Here is the "
	           + this.songKey + "Major Scale \n" + this.majorScale
	           + "\n Here are the chords in the key " + this.getChordsInKeyMajor();
	}
	
	public String toStringMinor() {
		return"You have selected " + this.songKey + "  Minor \n Here is the "
		           + this.songKey + "Major Scale \n" + this.minorScale
		           + "\n Here are the chords in the key " + this.getChordsInKeyMinor();
	}
	
	
	

	

}
