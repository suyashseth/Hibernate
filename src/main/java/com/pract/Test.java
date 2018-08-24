package com.pract;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration cfg  = new Configuration().configure();
		SessionFactory sfg = cfg.buildSessionFactory();
		Session session = sfg.openSession();
		Transaction trns = session.beginTransaction();
		
		User us = new User();
		us.setUser_name("abhi");
		us.setUser_number("12345");
		
		UserCredential uc = new UserCredential();
		uc.setUser_id("abhi123");
		uc.setPassword("12345");
		uc.setUser(us);
		
		session.save(uc);
		session.flush();
		trns.commit();
		session.close();
		
	}

}
