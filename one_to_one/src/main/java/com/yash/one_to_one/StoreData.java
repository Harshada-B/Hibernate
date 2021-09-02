package com.yash.one_to_one;
/*
 * HIBERNATE CASCADE TYPE
 * */

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
	      
	    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate_config.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();   
	    
	    /*---------CASCADE DELETE OR REMOVE RECORD FROM DATABASE--------- */ 
	    Employee em=session.find(Employee.class,1);
	    session.remove(em);
	    
	    /*ONE TO ONE MAPPING -----------MULTIPLE ADDRESS FOR EMPLOYEE INSERT*****************
	     * 
	     * Employee e1=new Employee();    
	    e1.setName("sohum");    
	    e1.setEmail("sohum@gmail.com");    
	         
	    Address address1=new Address();    
	    address1.setAddressLine1("madras");    
	    address1.setCity("sadfds");    
	    address1.setState("kerala");    
	    address1.setCountry("India");    
	    address1.setPincode(162521);    
	        
	    e1.setAddress(address1);    
	    address1.setEmployee(e1);    
	        
	    session.persist(e1); CASCADE PERSIST TYPE*/  
	    t.commit();    
	        
	    session.close();    
	    System.out.println("success");    
	}    
}
