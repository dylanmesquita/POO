package br.com.overraid;

public class professor extends pessoa {

	private double salario;
	private String materia;
	
	
	
	public professor(String nome, String sobrenome, int idade, double salario, String materia) {
		super(nome, sobrenome, idade);
		this.materia = materia;
		this.salario = salario;
	}
	
	public professor() {
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	@Override
	public String exibirPessoa() {
		return "salario: "+getSalario() +
				"; materia: "+getMateria();
	}
	
	public String dados() {
		return super.exibirPessoa()+" "+ this.exibirPessoa();
	}
	
	public String dados(String nome, String sobrenome) {
		setNome(nome);
		setSobrenome(sobrenome);
		return getNome() + " " + getSobrenome();
	}
	
	
	public void dados(String materia, double salario) {
		setMateria(materia);
		setSalario(salario);
	}
}
