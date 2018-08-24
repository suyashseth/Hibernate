package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction trns = session.beginTransaction();
		
		Student st = new Student();
		st.setStudent_branch("cs");
		st.setStudent_id(103);
		st.setStudent_name("Sheetal");

		session.save(st);
		session.flush();
		trns.commit();
		session.close();
		
		
		
	}

}
