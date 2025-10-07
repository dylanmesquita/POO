package br.com.abstrato;

public class cachorro extends Mamifero{
	private String tamanho;
	private String raça;
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	
	public cachorro(String nome, String raça, String tamanho) {
		super(nome);
		this.raça = raça;
		this.tamanho = tamanho;
	}
	@Override
	public String amamentar() {
		return null;
	}
	
	@Override
	public String emitirSom() { 
		return "o cachorro " + super.getNome()+", da raça "+ this.getRaça()+" late";
	}
}
