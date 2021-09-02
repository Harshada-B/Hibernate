package com.yash.hiber.Employee;

import javax.persistence.Column;
import javax.persistence.Embedded;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "employee2")
public class Employee1
{
@Id	@GeneratedValue(strategy=GenerationType.AUTO)
int id;
@Column(name="firstName",columnDefinition="VHARCHAR(20)")
String name;
@Column(name="lastName",columnDefinition="VHARCHAR(20)")
double salary;
String address;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}
}

