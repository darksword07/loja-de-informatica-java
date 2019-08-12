package entidades;

public class Cliente extends Pessoa{
	private Endereco endereco;
	private Login login;
	private int numero;
	
	public Cliente(String nome, String email, String password, Endereco endereco, int numero) {
		super(nome, email);
		this.login = new Login(email, password);
		this.endereco = endereco;
		this.numero = numero;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}

	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
		
	
}
