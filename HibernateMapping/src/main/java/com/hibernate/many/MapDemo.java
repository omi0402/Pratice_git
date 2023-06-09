package com.hibernate.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Question1 q1 = new Question1();
		q1.setQuestion_Id(10);
		q1.setQuestion("What is java");

		Answer1 a1 = new Answer1();
		a1.setAnswer_Id(101);
		a1.setAnswer("java is a programming language");
		a1.setQuestion(q1);

		Answer1 a2 = new Answer1();
		a2.setAnswer_Id(202);
		a2.setAnswer("with the help of java we create software");
		a2.setQuestion(q1);

		Answer1 a3 = new Answer1();
		a3.setAnswer_Id(303);
		a3.setAnswer("java is best language");
		a3.setQuestion(q1);

		List<Answer1> list = new ArrayList<Answer1>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		q1.setAnswer(list);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(a1);
		session.save(a2);
		session.save(a3);

		tx.commit();

		Question1 question = (Question1) session.get(Question1.class, 10);
		List<Answer1> answer = question.getAnswer();
		System.out.println(question.getQuestion());
		System.out.println(answer);

		session.close();
		factory.close();

	}
}
