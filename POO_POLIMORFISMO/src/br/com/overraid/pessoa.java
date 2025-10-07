package br.com.overraid;

public class pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	
	public pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	public pessoa() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String exibirPessoa() {
		return "nome completo: "+getNome() + getSobrenome()+
				"idade: "+ getIdade();
	}
}
