package br.com.pizzaria;

public class funcionario extends pessoa{
	private double salario; 
	private String cargo;
	private String nome;
	
	public String getNome() { 
		return nome;
	}
	
	public void settNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String exibirFuncionario(){
		return "apelido: "+ this.getNome() +super.exibirPessoa()+"trabalha como: "+ this.getCargo() +"; recebe: "+ this.getSalario()+ "R$"; 
	}	
	public funcionario(String nome, String sobrenome, String telefone, String CPF, int altura, String cargo, double salario) {
		super(nome, sobrenome, telefone, CPF, altura);	
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public funcionario() {
		super();
	}
}
