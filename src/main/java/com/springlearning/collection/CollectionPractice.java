package com.springlearning.collection;
import java.util.List;
import java.util.Map;

public class CollectionPractice {
	private String name;
	private List<String>phone;
	private List<String>addresses;
	private Map<String,Integer> course;

	public CollectionPractice() {
		super();
	}
	public CollectionPractice(String name, List<String> phone, List<String> addresses, Map<String, Integer> course) {
		super();
		this.name = name;
		this.phone = phone;
		this.addresses = addresses;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, Integer> getCourse() {
		return course;
	}
	public void setCourse(Map<String, Integer> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "CollectionPractice [name=" + name + ", phone=" + phone + ", addresses=" + addresses + ", course="
				+ course + "]";
	}
	

}
