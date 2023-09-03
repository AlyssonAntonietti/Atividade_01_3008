package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.PessoaJuridica;
import entidades.Contribuinte;
import entidades.PessoaFisica;

public class Programa {

	public static void main(String[] args) {
		
		List <Contribuinte> pessoa = new ArrayList<Contribuinte>();
		
		pessoa.add(new PessoaJuridica("Luke Construtora", 48900.78 , "15687462000135"));
		pessoa.add(new PessoaJuridica("Luke Concreto", 794900.78 , "56987462000135"));
		pessoa.add(new PessoaJuridica("Luke Digital", 8900.78 , "45687462000135"));
		pessoa.add(new PessoaJuridica("Luke Fibroplast", 56848900.78 , "75687462000135"));
		pessoa.add(new PessoaFisica("Alysson Antonietti", 900 , "47462000135"));
		pessoa.add(new PessoaFisica("Sandro da Silva", 10000 , "87602000135"));
		
		System.out.println(pessoa);
		
	}
}
