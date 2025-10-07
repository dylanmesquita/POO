package br.com.academic;

public class pessoa {
	private String nome;
	private String sobrenome;
	private String email;
	private int altura;
	private int anoDeNsmnt;

	public pessoa(String nome, String sobrenome, String email, int altura, int anoDeNsmnt) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.altura = altura;
		this.anoDeNsmnt = anoDeNsmnt;
	}
	
	public pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAnoDeNsmnt() {
		return anoDeNsmnt;
	}

	public void setAnoDeNsmnt(int anoDeNsmnt) {
		this.anoDeNsmnt = anoDeNsmnt;
	}
}

