package br.com.other;
import br.com.heranca.pessoa;

public class funcionario extends pessoa{
	public String cargo;
	public double salario;
	
	public funcionario(String nome, String email, int idade, String cargo, double salario) {
		super(nome, email, idade);
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public String exibirFunc() {
		return super.exibirPessoa() +"; cargo na empresa: "+cargo+ "; recebe: "+ salario;
	}
}
