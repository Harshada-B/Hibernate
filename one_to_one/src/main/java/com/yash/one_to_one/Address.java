package com.yash.one_to_one;
/*
 * HIBERNATE CASCADE TYPE ADDRESS ENTITY
 * */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  
@Table(name="address220")  
public class Address {    
      
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
private int addressId;    
private String addressLine1,city,state,country;    
private int pincode;    
  
@OneToOne(targetEntity=Employee.class)  
private Employee employee;

/**
 * @return the addressId
 */
public int getAddressId() {
	return addressId;
}

/**
 * @param addressId the addressId to set
 */
public void setAddressId(int addressId) {
	this.addressId = addressId;
}

/**
 * @return the addressLine1
 */
public String getAddressLine1() {
	return addressLine1;
}

/**
 * @param addressLine1 the addressLine1 to set
 */
public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}

/**
 * @return the city
 */
public String getCity() {
	return city;
}

/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}

/**
 * @return the state
 */
public String getState() {
	return state;
}

/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}

/**
 * @return the country
 */
public String getCountry() {
	return country;
}

/**
 * @param country the country to set
 */
public void setCountry(String country) {
	this.country = country;
}

/**
 * @return the pincode
 */
public int getPincode() {
	return pincode;
}

/**
 * @param pincode the pincode to set
 */
public void setPincode(int pincode) {
	this.pincode = pincode;
}

/**
 * @return the employee
 */
public Employee getEmployee() {
	return employee;
}

/**
 * @param employee the employee to set
 */
public void setEmployee(Employee employee) {
	this.employee = employee;
}  

}  