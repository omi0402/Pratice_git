package com.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// Creating Question
		Question q1 = new Question();
		q1.setQuestion_Id(1212);
		q1.setQuestion("what is Java?");

		// Creating Answer
		Answer a1 = new Answer();
		a1.setAnswer_Id(343);
		a1.setAnswer("Java is a programming language");

		// set Answer
		q1.setAnswer(a1);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(a1);
		tx.commit();
		// fetching
		Question ques = (Question) session.get(Question.class, 1212);
		System.out.println(ques.getQuestion());
		System.out.println(ques.getAnswer().getAnswer());

		
		session.close();
		factory.close();

	}
}
