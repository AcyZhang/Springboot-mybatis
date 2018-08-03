package com.example.pojo;



public class User  {
	private Integer id;

	private String name;

	private Integer age;
	private String imgpath;
	public User() {
	};



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}

	public User(Integer id, String name, Integer age, String imgpath) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.imgpath = imgpath;
	}

	public String getImgpath() {
		return imgpath;
	}

	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
}
