package br.com.pizzaria;

public class cliente extends pessoa {
	private String pedido;
	private double preço;
	private String nome;

	public void setterNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
	return nome;
	}	
	
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public cliente(String nome, String sobrenome, String telefone, String CPF, int altura, String pedido, double preço) {
		super(nome, sobrenome, telefone, CPF, altura);	
		this.pedido = pedido;
		this.preço = preço;
}
	public cliente() {
	super();	
	}	
	public String exibirCliente() {
		return "apelido: "+ this.getNome() +super.exibirPessoa()+" ; pediu "+ this.getPedido()+ "; preço de tal: "+ this.getPreço();
	}
	
	
}
