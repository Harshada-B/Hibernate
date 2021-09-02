package com.yash.MavenEmbeddedHibernate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmpDetails")
public class Employee {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id" ,columnDefinition="INTEGER")
private int id;
	@Column(name="fName" ,columnDefinition="VARCHAR(25)")
private String firstName;
	@Column(name="lName" ,columnDefinition="VARCHAR(25)")
private String lastName;
	@Embedded
	private Address address;	



public Employee(int id, String firstName, String lastName, Address address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

public Employee() {
	
}

public Address getAddress() 
{
		return address;
}
public void setAddress(Address address) 
{
		this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
}



}
