package br.com.academic;

public class professor extends pessoa {
	private double salario;
	private String materia;
	private String nome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
	public String exibirProfessor() {
		return "o professor" + super.getNome()+" "+ getSobrenome()+" tbm chamado de "+ this.getNome() +", leciona " + getMateria()+ " e recebe "+ getSalario()+ "; dados úteis: meça" + getAltura() + "; email:"+  getEmail() + "; nasceu no ano"+  getAnoDeNsmnt(); 
			
	}
	
	public professor() {
		super();
	}
	
	public professor(String nome, String sobrenome, String email, int altura, int anoDeNsmnt, double salario, String materia) {
		super(nome, sobrenome, email, altura, anoDeNsmnt);
		this.materia = materia;
		this.salario = salario;
	}
	

}
