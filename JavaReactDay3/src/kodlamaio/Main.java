package kodlamaio;

public class Main {

	public static void main(String[] args) {
		 Student student1 = new Student(1,"Ahmet Yalcin", "123456", "ahmetyalcin050@gmail.com");
		 Student student2 = new Student(2,"Selin Ucyildiz","Selin_Ucy","ucyildizs@gmail.com");
		 Student student3 = new Student(3,"Oguz Arslan","Og.Ars","oguzarslan@gmail.com");
		 
		 Instructor instructor = new Instructor(1, "Engin Demirog", 30, "engindemirog@gmail.com","Java,C#,Python");
 
		 
		 
		 InstructorManager instructorManager = new InstructorManager();
		 instructorManager.add(instructor);
		 instructorManager.delete(instructor);
		 instructorManager.update(instructor);
		 
		 
		 StudentManager studentManager = new StudentManager();
		 studentManager.add(student1);
		 studentManager.delete(student2);
		 studentManager.update(student3);

	}

}
