package br.com.abstrato;

public class papagaio extends Ave{

	public papagaio(String nome) {
		super(nome);
	}

	@Override
	public String voar() {
		return null;
	}
	
	@Override
	public String emitirSom() {
		return "o papagaio: "+ super.getNome() +", imita os sons";
	}
	
}
