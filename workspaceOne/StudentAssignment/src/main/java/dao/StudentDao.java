package dao;

import pojos.Student;

public interface StudentDao {
	
	String registerStudent(Student stud);
	Student userLogin(String email,String password);

}