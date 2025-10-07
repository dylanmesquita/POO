package br.com.abstrato;

public class testeAbestado {
	public static void main(String[]args) {
	cachorro Dog = new cachorro("andre", "gigante", "caramelo");
	gato Cat = new gato("dylan", "desconhecida");
	papagaio piriquito = new papagaio("Loro");
	System.out.println(Dog.emitirSom() + "\n" + Cat.emitirSom()+"\n"+piriquito.emitirSom());
	
	}
}