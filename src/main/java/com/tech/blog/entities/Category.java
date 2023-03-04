package com.tech.blog.entities;

public class Category {
	
	private int cid;
	private String name;
	private String descriptipn;
	
	public Category(int cid, String name, String descriptipn) {
		super();
		this.cid = cid;
		this.name = name;
		this.descriptipn = descriptipn;
	}

	public Category() {
		super();
	}

	public Category(String name, String descriptipn) {
		super();
		this.name = name;
		this.descriptipn = descriptipn;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptipn() {
		return descriptipn;
	}

	public void setDescriptipn(String descriptipn) {
		this.descriptipn = descriptipn;
	}
	
	

}
