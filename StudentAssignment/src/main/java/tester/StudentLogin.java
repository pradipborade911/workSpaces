package tester;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import utils.HibernateUtils;

public class StudentLogin {

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in);SessionFactory sf=HibernateUtils.getFactory())
		{
			StudentDaoImpl stdao=new StudentDaoImpl();
			stdao.getStudentDetails(sc.next(),sc.next());
		}

	}

}
