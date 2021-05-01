package kodlamaio;

public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+" named instructor added.");
	}

	public void delete(Instructor instructor) {
		System.out.println(instructor.getName()+" named instructor deleted.");

	}

	public void update(Instructor instructor) {
		System.out.println(instructor.getName()+" named instructor updated.");
	}
	
}
