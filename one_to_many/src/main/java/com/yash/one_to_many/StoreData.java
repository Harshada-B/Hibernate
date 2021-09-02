package com.yash.one_to_many;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData 
{
	public static void main(String[] args) {    
	      
	    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hiber_config.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();   
	      
	     
	   /* Employee e2=new Employee();    
	    e2.setName("manisha");    
	    e2.setEmail("manisha@gmail.com"); */  
	   
	    Address address=new Address();    
	    address.setAddressLine1("nagar");    
	    address.setCity("nashik");    
	    address.setState("Mahrashtra");    
	    address.setCountry("India");    
	    address.setPincode(410501);
	    
	    Address address2=new Address();    
	    address2.setAddressLine1("city street");    
	    address2.setCity("indore");    
	    address2.setState("M P");    
	    address2.setCountry("India");    
	    address2.setPincode(410505);  
	    
	    ArrayList <Address> arr=new ArrayList<Address>(); 
	    arr.add(address);
	    arr.add(address2);
	    
	    Employee e1=new Employee();    
	    e1.setName("aditi");    
	    e1.setEmail("aditi@gmail.com"); 
	    e1.setAddress(arr);
	        
	   /* e1.getAddress().add(address); 
	    e1.getAddress().add(address2);*/   
	   // address.setEmployee(e1);    
	    session.save(e1);
	    session.save(address);
	    session.save(address2);
	    t.commit();    
	     
	    System.out.println("success data to employee");
	    System.out.println("success data to address");  
	    session.close();      
	}    
}
