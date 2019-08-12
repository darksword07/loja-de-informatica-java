package entidades;

public class Funcionario extends Pessoa{
	
	private int cod;
	private Login login;
	private Cargo cargo;
	private Endereco endereco;
	private String rg;
	private String cpf;
	private String dataAdmissao;
	
	public Funcionario(String nome, String email, int cod, Login login,
			Cargo cargo, Endereco endereco, String rg, String cpf,String dataAdmissao) {
		
		super(nome, email);
		this.cod = cod;
		this.login = login;
		this.cargo = cargo;
		this.endereco = endereco;
		this.rg = rg;
		this.cpf = cpf;
		this.dataAdmissao = dataAdmissao;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getCod() {
		return cod;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	
	
	
	

}
