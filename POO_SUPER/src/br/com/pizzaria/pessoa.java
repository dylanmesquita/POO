package br.com.pizzaria;

public class pessoa {
	private String nome;
	private String sobrenome;
	private String telefone;
	private String CPF;
	private int altura;
	
	public pessoa(String nome, String sobrenome, String telefone, String CPF, int altura) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.CPF = CPF;
		this.altura = altura;
	}
	
	public pessoa() {}
	
	
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public String exibirPessoa() {
		return "nome completo: "+this.getNome()+" " +this.getSobrenome()+ "; telefone pessoal: "+ getTelefone()+ "; cpf:"+ getCPF(); 
	}
}
