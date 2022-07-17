package com.test.Teacher.entity;

import javax.persistence.Entity;
@Entity
public class TeacherRecord {
	@javax.persistence.Id
private int Id;
private String Name;
private String Address;
private String Email;
private double Mobile;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public double getMobile() {
	return Mobile;
}
public void setMobile(double mobile) {
	Mobile = mobile;
}
public TeacherRecord(int id, String name, String address, String email, double mobile) {
	super();
	Id = id;
	Name = name;
	Address = address;
	Email = email;
	Mobile = mobile;
}
public TeacherRecord() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "TeacherRecord [Id=" + Id + ", Name=" + Name + ", Address=" + Address + ", Email=" + Email + ", Mobile="
			+ Mobile + "]";
}

}
