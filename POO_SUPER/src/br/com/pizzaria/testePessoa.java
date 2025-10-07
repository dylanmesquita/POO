package br.com.pizzaria;

public class testePessoa {
	public static void main(String[]args) {
		funcionario fc = new funcionario("Lucas", "Machado", "XX XXXXX-XXXX", "000.000.000-00", 182, "gerente", 5120);
		fc.settNome("texugo");
		System.out.println(fc.exibirFuncionario());
		
		cliente cl = new cliente("Dylan", " mesquita", "XX XXXXX-XXXX", "000.000.000-00", 185,  "pizza portuguesa", 23.99);
		cl.setterNome("Zoiao");
		System.out.println(cl.exibirCliente());
		
		fornecedor fn = new fornecedor("Odilio", "Carneiro", "XX XXXXX-XXXX", "000.000.000-00", 187, "Rua carneiro", 500);
		fn.stNome("olidio");
		System.out.println(fn.exibirFornecedor());
	}
}
