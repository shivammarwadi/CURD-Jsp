package com.model;

public class student 
{
	private int stud_id;
	private String first_name;
	private String last_name;
	private String address;
	private String city;
	@Override
	public String toString() {
		return "student [stud_id=" + stud_id + ", first_name=" + first_name + ", last_name=" + last_name + ", address="
				+ address + ", city=" + city + "]";
	}
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public student() {
		super();
	}
	public student(int stud_id, String first_name, String last_name, String address, String city) {
		super();
		this.stud_id = stud_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.city = city;
	}
	public student(int stud_id) {
		super();
		this.stud_id = stud_id;
	}
	
}
