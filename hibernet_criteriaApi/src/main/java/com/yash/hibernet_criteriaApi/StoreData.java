package com.yash.hibernet_criteriaApi;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
		/*CRITERIA API SELECT*/
		
		CriteriaBuilder cb=session.getCriteriaBuilder();  
		CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);  

		Root<Employee> emp=cq.from(Employee.class);  

		//cq.multiselect(emp.get("name")); SELECT ALL ID  

		cq.orderBy(cb.asc(emp.get("name")));  //ORDER BY NAME IN ASCENDING ORDER
		CriteriaQuery<Employee> select = cq.select(emp);  
		TypedQuery<Employee> q = session.createQuery(select);  
		List<Employee> list = q.getResultList();  

		System.out.println("employeeId");
		System.out.print("\t name");  
        System.out.println("\t email"); 
		
		for(Employee e:list)  
		{  
			System.out.println(e.getEmployeeId()); 
			System.out.print("\t"+e.getName());  
	          System.out.println("\t"+e.getEmail());
	          //System.out.println("\t"+e.getAddress());
		}  
		t.commit();    

		session.close();    
		System.out.println("success");    
	}
}