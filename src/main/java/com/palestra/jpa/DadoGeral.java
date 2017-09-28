package com.palestra.jpa;

public class DadoGeral {

	private String nome;
	private String endereco;
	private String bairro;
	private String municipio;
	private String estado;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof DadoGeral)) {
			return false; 
		}
		
		DadoGeral dado = (DadoGeral) obj;
		
		if( this.getNome() != null && dado.getNome().contains(this.getNome()))
			return true;
		
		if( ( this.getBairro() != null && dado.getBairro() != null ) && ( dado.getBairro().contains(this.getBairro() )))
			return true;
		
		return false;
	}
	
	
}
