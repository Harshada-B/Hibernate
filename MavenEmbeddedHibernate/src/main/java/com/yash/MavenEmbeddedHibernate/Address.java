package com.yash.MavenEmbeddedHibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class Address 
{
		
	@Column(name="STREETNAME" ,columnDefinition="VARCHAR(25)")
		private String street;
	@Column(name="CITYNAME" ,columnDefinition="VARCHAR(25)")
		private String city;
	@Column(name="STATENAME" ,columnDefinition="VARCHAR(25)")
		private String state;
	@Column(name="PINCODE" ,columnDefinition="VARCHAR(25)")
		private String pincode;
		
		
		
		
		public Address(String street, String city, String state, String pincode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
		public Address() {
			
		}
		public String getStreet() 
		{
			return street;
		}
		public void setStreet(String street) 
		{
			this.street = street;
		}
		public String getCity() 
		{
			return city;
		}
		public void setCity(String city) 
		{
			this.city = city;
		}
		public String getState() 
		{
			return state;
		}
		public void setState(String state) 
		{
			this.state = state;
		}
		public String getPincode() 
		{
			return pincode;
		}
		public void setPincode(String pincode) 
		{
			this.pincode = pincode;
		}
		@Override
		public String toString() {
			return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
		}
		

		
		
		
}
 