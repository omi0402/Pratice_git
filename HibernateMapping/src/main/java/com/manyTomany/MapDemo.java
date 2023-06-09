package com.manyTomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.setEid(10);
		e1.setEname("Rahul");
		e2.setEid(11);
		e2.setEname("Govinda");

		Project p1 = new Project();
		Project p2 = new Project();

		p1.setPid(101);
		p1.setPname("Library management");

		p2.setPid(102);
		p2.setPname("Health Insurance System");

		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(e1);
		list1.add(e2);

		List<Project> list2 = new ArrayList<Project>();
		list2.add(p1);
		list2.add(p2);

		e1.setProject(list2);
		p2.setEmployee(list1);

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		tx.commit();
		session.close();
		factory.close();

	}
}
