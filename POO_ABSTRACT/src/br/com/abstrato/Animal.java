package br.com.abstrato;

public abstract class Animal {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String emitirSom() {
		return "um "+ getNome()+", emite o som: ";
	}
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public Animal() {
	}
}
