package tester;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Course;
import pojos.Student;
import utils.HibernateUtils;

public class userLogin {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in); SessionFactory sf = HibernateUtils.getFactory()){
			StudentDaoImpl dao = new StudentDaoImpl();
			
			System.out.println(dao.userLogin("surajgavade1@gmail.com", "Suraj!789"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
