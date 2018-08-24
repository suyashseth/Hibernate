package com.pract;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestStudent {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sfg = cfg.buildSessionFactory();
		Session session = sfg.openSession();
		Transaction trns = session.beginTransaction();
		
		Student st = new Student();
		st.setStudent_name("Sheetal");
		st.setStudent_branch("CS");
		
		session.save(st);
	    session.flush();
	    trns.commit();
	    session.close();
	    sfg.close();
		
		
		
		
		
		
		
		
		
		}

}
