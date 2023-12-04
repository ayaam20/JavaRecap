package com.capgemini.HibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.capgemini.HibernateDemo.entity.Employee;

public class HibernateDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee emp1 = new Employee(1001, "Ram", "Manager", 70000);
		Employee emp2 = new Employee(1002, "Amar", "Architect", 110000);
		session.save(emp1);
		session.save(emp2);
//		session.delete(emp2);
		
		List<Employee> empList = session.createQuery("from Employee").list();
		System.out.println("Employee Details");
		for(Employee emp:empList){
			System.out.println(emp);
		}
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		tx.commit();
		session.close();
		
		
	}
}
