package entidades;

public class Admin extends Pessoa{
	private Login login;
	
	public Admin(String nome, String username, String password) {
		super(nome, username);
		this.login = new Login(username, password);
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
}
