package udistrital.design.patterns.structural.bridge;

public abstract class Teacher {

	Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void offeringClasses() {
		student.takeClasses();
	}
	
	
}
