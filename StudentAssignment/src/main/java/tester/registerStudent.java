package tester;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Course;
import pojos.Student;
import utils.HibernateUtils;

public class registerStudent {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in); SessionFactory sf = HibernateUtils.getFactory()){
			StudentDaoImpl dao = new StudentDaoImpl();
			
			/*
			 * (String firstName, String lastName, String email, String password, String comfirmPassword,
			Course course, Double admissionFees, Date dob)
			 */
//			dao.registerStudent(new Student("Suraj", "Gavade", "surajgavade1@gmail.com", "Suraj!789", "Suraj!789", Course.JAVA, 106000.0, LocalDate.parse("1998-12-12")));
			System.out.println(dao.userLogin("surajgavade1@gmail.com", "Suraj!789"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
