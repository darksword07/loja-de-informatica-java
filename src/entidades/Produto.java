package entidades;

public class Produto {
	private int cod;
	private String descricao;
	private double preco;
	
	public Produto(int cod, String descricao, double preco) {
		super();
		this.cod = cod;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCod() {
		return cod;
	}
	
	

}
