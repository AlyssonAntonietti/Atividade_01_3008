package entidades;

public final class PessoaFisica extends Contribuinte {

	private String cpf;

	public PessoaFisica(String nome, double renda, String cpf) {
		super(nome, renda);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "\n Pessoa Física" + "\n CFP: " + cpf + "\n Nome: " + nome + "\n Renda: " + String.format("R$ %.2f ", renda)
				+ "\n IR: " + String.format("R$ %.2f ", calculaImposto()) + "\n";
	}

	@Override
	public double calculaImposto() {
		double IR;
		double renda = this.renda;

		if (renda > 1903.99 && renda < 2826.65) {
			IR = renda * 0.075;
		} else if (renda > 2826.66 && renda < 3751.05) {
			IR = renda * 0.15;
		} else if (renda > 3751.06 && renda < 4664.68) {
			IR = renda * 0.225;
		} else if (renda > 4664.68) {
			IR = renda * 0.275;
		} else {
			IR = 0;
		}

		return IR;
	}

}
