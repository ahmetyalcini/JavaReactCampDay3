package kodlamaio;

public class User {

	private int id;
    public String name;
    private String password;
    private String email;

    
    public User(int id, String name,String password, String email) { //For students
        super();
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;

    }
    
	

	public User(int id, String name, int age, String email,String profession) {   //For instructor
		this(id, name, profession, email);
		
	}



	public int getId() {
    	return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public String getName(){
    	return name;
    }
    
    public void setName (String name) {
    	this.name = name;
    }
    
    public String getPassword() {
    	return password;
    }
    
    public void setPassword (String password) {
    	this.password = password;
    }
    
    public String getEmail() {
    	return email;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
}
