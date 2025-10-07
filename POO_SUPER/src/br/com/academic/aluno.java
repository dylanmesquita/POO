package br.com.academic;

public class aluno extends pessoa {
	private String curso;
	private double notaFinal;
	private String nome;
	
	public String getCurso() {
		return curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	public String aprovacao() {
		if (getNotaFinal() >= 7) {
			 return "aprovado";
		}
		else{
		
		return "reprovado";
		}
	}	
	
	public String exibirAprovacao() {
	
		return  "o aluno "+ super.getNome() + getSobrenome()+ "tambem chamado de: "+ this.getNome() + "no curso"+ getCurso() +" foi: " + aprovacao() + "; dados úteis: meça" + getAltura() + "; email:"+  getEmail() + "; nasceu no ano"+  getAnoDeNsmnt();	
		}
	public aluno() {
		super();
	}
	
	public aluno(String nome, String sobrenome, String curso) {
		super(nome, sobrenome);
		this.curso = curso;
	}
	
}