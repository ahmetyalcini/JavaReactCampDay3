package kodlamaio;

public class Instructor extends User {

	
	String email;
	String profession;
    String name;

	public Instructor(int id, String name, int age, String email,String profession) {
		super(id, name, age, email, profession);
		this.email = email;
		this.profession = profession;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
}
