package kodlamaio;

public class StudentManager extends UserManager{

	public void add(Student student) {
		System.out.println(student.getName()+" named student added.");
	}


	public void delete(Student student) {
		System.out.println(student.getName()+" named student deleted.");
	}

	public void update(Student student) {
		System.out.println(student.getName()+" named student updated.");
	}
	
}
