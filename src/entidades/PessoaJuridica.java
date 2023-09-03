package entidades;

public final class PessoaJuridica extends Contribuinte {

	private String cnpj;

	public PessoaJuridica(String nome, double renda, String cnpj) {
		super(nome, renda);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	@Override
	public String toString() {
		return "\n Pessoa Jurídica" + "\n CNPJ: " + cnpj + "\n Nome: " + nome + "\n Renda: "
				+ String.format("R$ %.2f ", renda) + "\n IR: " + String.format("R$ %.2f ", calculaImposto()) + "\n";
	}

	@Override
	public double calculaImposto() {
		return this.renda * 0.1;
	}

}
