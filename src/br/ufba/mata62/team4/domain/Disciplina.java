package br.ufba.mata62.team4.domain;

public class Disciplina {
	
	private String codigoDisc;
	private String nomeDisc;
	private int ch;
	
	public Disciplina(String codigo, String nome, int cargaHoraria) {
		this.codigoDisc = codigo;
		this.nomeDisc = nome;
		this.ch = cargaHoraria;
	}
	
	public String getCodigo() {
		return codigoDisc;
	}
	
	public void setCodigo(String codigo) {
		this.codigoDisc = codigo;
	}
	
	public String getNome() {
		return nomeDisc;
	}
	
	public void setNome(String nome) {
		this.nomeDisc = nome;
	}
	
	public int getCargaHoraria() {
		return ch;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.ch = cargaHoraria;
	}	
}