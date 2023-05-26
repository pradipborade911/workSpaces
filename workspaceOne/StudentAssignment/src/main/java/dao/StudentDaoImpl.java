package dao;

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
		session.save(stud);
		tx.commit();
		returnMessage = "Inserted!!!";
		}catch(RuntimeException e) {
			tx.rollback();
			throw e;
		}
		
		return returnMessage;
	}
}
