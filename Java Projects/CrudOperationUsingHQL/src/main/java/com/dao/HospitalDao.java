package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Hospital;
import com.util.HibernateUtil;

public class HospitalDao {

	public void insertData(String p_name, int p_age, String p_address) {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			Transaction tran = session.beginTransaction();

//			Hospital h = new Hospital(p_name, p_age, p_address);
//			session.persist(h);
//			tran.commit();
//			System.out.println("Patient details inserted successfully: " + h.getP_name() + ", Age: " + h.getP_age()
//					+ ", Address: " + h.getP_address());
			String hqlQuery = "insert into Hospital (P_name, P_age, P_address) values (:name, :age, :address)";
			Query<Hospital> result = session.createQuery(hqlQuery);
			result.setParameter("name", p_name);
			result.setParameter("age", p_age);
			result.setParameter("address", p_address);
			result.executeUpdate();

			tran.commit();
			session.close();

			System.out.println("Patient details inserted successfully: Name: " + p_name + ", Age: " + p_age
					+ ", Address: " + p_address);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred while inserting employee data: " + e.getMessage());
		}

	}

	public void updateData(int id, String p_name, int p_age, String p_address) {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			Transaction tran = session.beginTransaction();

			String hqlQuery = "update Hospital set P_name=:pname, p_age=:age, p_address=:address where id=:id";

			MutationQuery result = session.createMutationQuery(hqlQuery);
			result.setParameter("name", p_name);
			result.setParameter("age", p_age);
			result.setParameter("address", p_address);

			result.executeUpdate();
			tran.commit();
			session.close();
			System.out.println("Patient details updated successfully: Name: " + p_name + ", Age: " + p_age
					+ ", Address: " + p_address);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred while updating employee data: " + e.getMessage());
		}
	}

	public void deleteData(int id) {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			Transaction tran = session.beginTransaction();
			Hospital h = session.get(Hospital.class, id);
			if (h != null) {
				String hqlQuery = "delete from Hospital where id=:id";
				MutationQuery query = session.createMutationQuery(hqlQuery);
				query.setParameter("id", id);
				query.executeUpdate();
				tran.commit();
				System.out.println("Patient with ID " + id + " deleted successfully");
			} else {
				System.out.println("Patient with ID " + id + " not found");
			}
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred while deleting patient data: " + e.getMessage());
		}
	}
}
