package hello;

public class Users {

	private String email;
	private String lastName;
	private String firstName;
	private String name;
	private String title;
	private String dept;
	private String branch;
	private String languages;
	
	public Users(final String name) {
		this.name = name;
	}
	
	public Users(String first, String last) {
		lastName = last;
		firstName = first;
		name = first + " " + last;
	}

    public Users(String first, String last, String email) {
        lastName = last;
        firstName = first;
        name = first + " " + last;
        this.email = email;
    }

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
