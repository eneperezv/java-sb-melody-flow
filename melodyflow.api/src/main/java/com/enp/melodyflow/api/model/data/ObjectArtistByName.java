package com.enp.melodyflow.api.model.data;

public class ObjectArtistByName {
	
	private Artist artists;

	public Artist getArtists() {
		return artists;
	}

	public void setArtists(Artist artists) {
		this.artists = artists;
	}

	@Override
	public String toString() {
		return "ObjectArtistByName [artists=" + artists + "]";
	}

}
