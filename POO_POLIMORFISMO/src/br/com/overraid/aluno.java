package br.com.overraid;

public class aluno	extends pessoa {

	private String matricula;
	private String serie;
	
	
	public aluno(String nome, String sobrenome, int idade, String matricula, String serie) {
		super(nome, sobrenome, idade);
		setMatricula(matricula);
		setSerie(serie);
	}

	public aluno(){
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getSerie() {
		return serie;
	}
	
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	@Override
	public String exibirPessoa() {
		return "matricula: "+getMatricula()+
		"serie: "+getSerie();
	}
	
	public String dados() {
		return super.exibirPessoa()+" "+ this.exibirPessoa();
	}
	
	public void dados(String nome, String sobrenome) {
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	public void dados(String matricula, String serie, int idade) {
		setMatricula(matricula);
		setSerie(serie);
		setIdade(idade);
	}
	
}
