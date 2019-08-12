package entidades;

public class Login {
	private String username;
	private String password;
	public Login(String email, String password) {
		super();
		this.username = email;
		this.password = password;
	}
	public String getEmail() {
		return username;
	}
	public void setEmail(String email) {
		this.username = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
