package br.com.abstrato;

public class gato extends Mamifero{
	private String raça;
	
	public gato(String nome, String raça) {
		super(nome);
		this.raça = raça;
	}
	
	@Override
	public String amamentar() {
		return null;
	}
	
	@Override
	public String emitirSom() {
		return "o gato "+ super.getNome()+" da raça "+getRaça()+" mia";
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}
	
}
