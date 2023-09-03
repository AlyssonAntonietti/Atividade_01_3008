package entidades;

public abstract class Contribuinte {

	protected String nome;
	protected double renda;

	public Contribuinte(String nome, double renda) {
		super();
		this.nome = nome;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	@Override
	public String toString() {
		return "\n Nome: " + nome + "\n Renda: " + String.format("R$ %.2f ", renda) + "\n IR: "
				+ String.format("R$ %.2f ", calculaImposto());
	}

	public abstract double calculaImposto();


}
