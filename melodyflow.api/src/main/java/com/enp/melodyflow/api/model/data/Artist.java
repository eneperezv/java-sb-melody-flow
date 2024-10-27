package com.enp.melodyflow.api.model.data;

public class Artist {
	
	private ExternalUrls external_urls;
	private String href;
	private String id;
	private String name;
	private String type;
	private String uri;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Artist [external_urls=" + external_urls + ", href=" + href + ", id=" + id + ", name=" + name + ", type="
				+ type + ", uri=" + uri + "]";
	}

}
