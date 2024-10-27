package com.enp.melodyflow.api.model.data;

import java.util.ArrayList;

public class ObjectTrackById {
	
	private Album album;
	private ArrayList<Artist> artists;
	private ArrayList<String> available_markets;
	private Integer disc_number;
	private Integer duration_ms;
	private boolean explicit;
	private ExternalIds external_ids;
	private ExternalUrls external_urls;
    private String href;
    private String id;
    private boolean is_local;
    private String name;
    private Integer popularity;
    private Integer track_number;
    private String type;
    private String uri;
    
	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
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

	public Integer getDisc_number() {
		return disc_number;
	}

	public void setDisc_number(Integer disc_number) {
		this.disc_number = disc_number;
	}

	public Integer getDuration_ms() {
		return duration_ms;
	}

	public void setDuration_ms(Integer duration_ms) {
		this.duration_ms = duration_ms;
	}

	public boolean isExplicit() {
		return explicit;
	}

	public void setExplicit(boolean explicit) {
		this.explicit = explicit;
	}

	public ExternalIds getExternal_ids() {
		return external_ids;
	}

	public void setExternal_ids(ExternalIds external_ids) {
		this.external_ids = external_ids;
	}

	public ExternalUrls getExternal_urls() {
		return external_urls;
	}

	public void setExternal_urls(ExternalUrls external_urls) {
		this.external_urls = external_urls;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isIs_local() {
		return is_local;
	}

	public void setIs_local(boolean is_local) {
		this.is_local = is_local;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPopularity() {
		return popularity;
	}

	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}

	public Integer getTrack_number() {
		return track_number;
	}

	public void setTrack_number(Integer track_number) {
		this.track_number = track_number;
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
		return "Root [album=" + album + ", artists=" + artists + ", available_markets=" + available_markets
				+ ", disc_number=" + disc_number + ", duration_ms=" + duration_ms + ", explicit=" + explicit
				+ ", external_ids=" + external_ids + ", external_urls=" + external_urls + ", href=" + href + ", id="
				+ id + ", is_local=" + is_local + ", name=" + name + ", popularity=" + popularity + ", track_number="
				+ track_number + ", type=" + type + ", uri=" + uri + "]";
	}

}
