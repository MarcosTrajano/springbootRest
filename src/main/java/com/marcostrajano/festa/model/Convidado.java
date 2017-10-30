package com.marcostrajano.festa.model;

public class Convidado {
	private String nome;
	private int quantidadeAcompanhantes;
	
	public Convidado() {
		
	}
	
	public Convidado(String nome, int quantidadeAcompanhantes) {
		super();
		this.setNome(nome);
		this.setQuantidadeAcompanhantes(quantidadeAcompanhantes);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}

	public void setQuantidadeAcompanhantes(int quantidadeAcompanhantes) {
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}
	
	

}
