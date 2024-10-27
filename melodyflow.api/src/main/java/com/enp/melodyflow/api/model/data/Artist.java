package com.enp.melodyflow.api.model.data;

import java.util.ArrayList;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public class Artist {
	
	private ExternalUrls external_urls;
	private String href;
	private String id;
	private String name;
	private String type;
	private String uri;
	private ArrayList<Item> items;
	private Integer limit;
	private String next;
	private Integer offset;
	private Object previous;
	private Integer total;

}
