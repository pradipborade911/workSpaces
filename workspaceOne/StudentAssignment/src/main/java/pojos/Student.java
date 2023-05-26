package pojos;

import java.time.LocalDate;
import javax.persistence.*;


@Entity
@Table(name="student153")
public class Student {
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Id
	@Column(name="email",unique = true)
	private String email;
	@Column(name="password")
	private String password;
	@Transient
	private String comfirmPassword;
	@Enumerated(EnumType.STRING)
	@Column(name="course_name")
	private Course course;
	@Column(name="admission_fees")
	private Double admissionFees;
	@Column(name="dob")
	private LocalDate dob;
	
	public Student() {
		//default constructor
	}

	public Student(String firstName, String lastName, String email, String password, String comfirmPassword,
			Course course, Double admissionFees, LocalDate dob) {
		super();	

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.comfirmPassword = comfirmPassword;
		this.course = course;
		this.admissionFees = admissionFees;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", course=" + course + ", admissionFees=" + admissionFees + ", dob=" + dob + "]";
	}
}
