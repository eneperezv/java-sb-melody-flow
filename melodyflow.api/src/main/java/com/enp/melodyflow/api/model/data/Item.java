package com.enp.melodyflow.api.model.data;

import java.util.ArrayList;

public class Item {
	
	private ExternalUrls external_urls;
	private Followers followers;
	private ArrayList<String> genres;
	private String href;
	private String id;
	private ArrayList<Image> images;
	private String name;
	private Integer popularity;
    private String type;
    private String uri;
    
	public ExternalUrls getExternal_urls() {
		return external_urls;
	}

	public void setExternal_urls(ExternalUrls external_urls) {
		this.external_urls = external_urls;
	}

	public Followers getFollowers() {
		return followers;
	}

	public void setFollowers(Followers followers) {
		this.followers = followers;
	}

	public ArrayList<String> getGenres() {
		return genres;
	}

	public void setGenres(ArrayList<String> genres) {
		this.genres = genres;
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

	public Integer getPopularity() {
		return popularity;
	}

	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
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
		return "Item [external_urls=" + external_urls + ", followers=" + followers + ", genres=" + genres + ", href="
				+ href + ", id=" + id + ", images=" + images + ", name=" + name + ", popularity=" + popularity
				+ ", type=" + type + ", uri=" + uri + "]";
	}

}
