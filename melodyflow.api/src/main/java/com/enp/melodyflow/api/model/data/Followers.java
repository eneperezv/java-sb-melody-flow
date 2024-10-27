package com.enp.melodyflow.api.model.data;

public class Followers {
	
	private Object href;
	private Integer total;
	
	public Object getHref() {
		return href;
	}

	public void setHref(Object href) {
		this.href = href;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Followers [href=" + href + ", total=" + total + "]";
	}

}
