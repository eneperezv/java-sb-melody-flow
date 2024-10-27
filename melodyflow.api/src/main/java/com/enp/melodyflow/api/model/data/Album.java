package com.enp.melodyflow.api.model.data;

import java.util.ArrayList;

public class Album {
	
	private String album_type;
	private ArrayList<Artist> artists;
	private ArrayList<String> available_markets;
	private ExternalUrls externalUrls;
	private String href;
	private ArrayList<Image> images;
	private String name;
	private String release_date;
	private String release_date_precision;
	private Integer total_tracks;
	private String type;
	private String uri;
	
	public String getAlbum_type() {
		return album_type;
	}

	public void setAlbum_type(String album_type) {
		this.album_type = album_type;
	}

	public ArrayList<Artist> getArtists() {
		return artists;
	}

	public void setArtists(ArrayList<Artist> artists) {
		this.artists = artists;
	}

	public ArrayList<String> getAvailable_markets() {
		return available_markets;
	}

	public void setAvailable_markets(ArrayList<String> available_markets) {
		this.available_markets = available_markets;
	}

	public ExternalUrls getExternalUrls() {
		return externalUrls;
	}

	public void setExternalUrls(ExternalUrls externalUrls) {
		this.externalUrls = externalUrls;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public ArrayList<Image> getImages() {
		return images;
	}

	public void setImages(ArrayList<Image> images) {
		this.images = images;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getRelease_date_precision() {
		return release_date_precision;
	}

	public void setRelease_date_precision(String release_date_precision) {
		this.release_date_precision = release_date_precision;
	}

	public Integer getTotal_tracks() {
		return total_tracks;
	}

	public void setTotal_tracks(Integer total_tracks) {
		this.total_tracks = total_tracks;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	@Override
	public String toString() {
		return "Album [album_type=" + album_type + ", artists=" + artists + ", available_markets=" + available_markets
				+ ", externalUrls=" + externalUrls + ", href=" + href + ", images=" + images + ", name=" + name
				+ ", release_date=" + release_date + ", release_date_precision=" + release_date_precision
				+ ", total_tracks=" + total_tracks + ", type=" + type + ", uri=" + uri + "]";
	}

}
