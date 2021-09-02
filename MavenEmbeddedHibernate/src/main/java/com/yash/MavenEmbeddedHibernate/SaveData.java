package com.yash.MavenEmbeddedHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;




public class SaveData {  
public static void main(String[] args) {  
      
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_config.xml").build();
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

SessionFactory factory = meta.getSessionFactoryBuilder().build();
Session session = factory.openSession();
Transaction t = session.beginTransaction(); 
          
Employee e1=new Employee();  
   e1.setId(2);  
    e1.setFirstName("harshada");  
    e1.setLastName("buchude");  

Address addr = new Address();    
      addr.setStreet("jalna road");
      addr.setCity("jalna");
      addr.setPincode("212121");
      addr.setState("Mh");
      e1.setAddress(addr);
      
    session.save(e1);
   session.update(e1);
   

   // session.delete(e1);
	t.commit();
   System.out.println("successfully saved");  
	//factory.close();
   session.close();  
     // e1 = null;
      //session = factory.openSession();
      //session.beginTransaction();
      
     //e1 = (Employee) session.get(Employee.class, 1);
     //System.out.println(e1.getId()+" "+e1.getFirstName()+" "+e1.getLastName()); 
     
      }  
} 