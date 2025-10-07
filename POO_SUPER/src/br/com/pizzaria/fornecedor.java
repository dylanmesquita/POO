package br.com.pizzaria;

public class fornecedor extends pessoa{
	private String endereco;
	private int quantia;
	private String nome;
	
	
	public String getNome() {
		return nome;
	}
	public void stNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getQuantia() {
		return quantia;
	}
	public void setQuantia(int quantia) {
		this.quantia = quantia;
	}
	
	public fornecedor(String nome, String sobrenome, String telefone, String CPF, int altura, String endereco, int quantia) {
		super(nome, sobrenome, telefone, CPF, altura);
		this.endereco = endereco;
		this.quantia = quantia;
	}
	
	public fornecedor() {
		super();
		}
	
	public String exibirFornecedor() {
		return "apelido: "+ this.getNome() +super.exibirPessoa() + ", localizado em: "+ getEndereco()+ "; carga de: "+ getQuantia()+"  massas de pizza";
	}
	
	
}
