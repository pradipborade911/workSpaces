package dao;

import java.io.Serializable;
import java.sql.Date;


import org.hibernate.*;

import pojos.Course;
import pojos.Student;
import utils.HibernateUtils;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String registerStudent(Student stud) {
		String returnMessage = "Not Inserted!!!";
//		Session session  = HibernateUtils.getFactory().openSession();
		Session session  = HibernateUtils.getFactory().getCurrentSession();
		Transaction tx= session.beginTransaction();
		
		try {
		Serializable id = session.save(stud);
		tx.commit();
		returnMessage = "Inserted!!!";
		}catch(RuntimeException e) {
			tx.rollback();
			throw e;
		}
		
		return returnMessage;
	}
	
	public Student userLogin(String email,String password)
	{		
		Student student = null;
		Session session  = HibernateUtils.getFactory().getCurrentSession();
		Transaction tx = session.getTransaction();
		
		try {
			Serializable id = session;
			String query = "SELECT student FROM Student student WHERE student.email=:givenEmail AND student.password=:givenPassword";
			student = session.createQuery(query, Student.class)
					.setParameter("givenEmail", email)
					.setParameter("givenPassword", password)
					.getSingleResult();
			tx.commit();
		}catch(RuntimeException e) {
			throw e;
		}
		return student;
	}
}