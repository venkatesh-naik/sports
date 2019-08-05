package com.xworkz.thor.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.thor.dto.SportsDto;

public class SportsDaoImpl implements SportsDao {
	@Override
	public void save(SportsDto dto) {
		
		boolean flag = true;
		SessionFactory factory = new Configuration().configure(
				"resource/hibernate.cfg.xml").buildSessionFactory();
		System.out.println("invoke save");
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		try {
			session.save(dto);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			flag = false;

		}
		session.close();	
	}

}
