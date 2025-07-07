package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Hospital;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hospital.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();

		String hql = "from Hospital";
		Query<Hospital> query = session.createQuery(hql, Hospital.class);
		List<Hospital> list =  query.list();
	}
}
