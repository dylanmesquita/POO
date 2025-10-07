package br.com.heranca;

public class pessoa {
	public String nome;
	protected String email;
	private int idade;

	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {	
		this.idade = idade;
	}
	
	public pessoa(String nome, String email, int idade) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}
	
	public String exibirPessoa() {
		return "nome: "+ nome + "; email: "+ email+"; idade: "+ getIdade();
	}
}	
