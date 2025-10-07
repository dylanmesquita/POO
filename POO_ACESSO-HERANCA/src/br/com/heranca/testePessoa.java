package br.com.heranca;
import br.com.other.*;

public class testePessoa {
	public static void main(String[]args) {
		funcionario func = new funcionario("Dyla", "dyla124@gmail.com", 21, "gerente", 9123.12);
		System.out.println(func.exibirFunc());
	}
}
