package entidades;

import java.util.ArrayList;

public class Disciplina {
	private String codigo_disc;
	private String nome_disc;
	private int ch;
	
	public Disciplina(String codigo, String nome, int carga_horaria) {
		this.codigo_disc = codigo;
		this.nome_disc = nome;
		this.ch = carga_horaria;
	}
	
	public String getCodigo() {
		return codigo_disc;
	}
	public void setCodigo(String codigo) {
		this.codigo_disc = codigo;
	}
	public String getNome() {
		return nome_disc;
	}
	public void setNome(String nome) {
		this.nome_disc = nome;
	}
	public int getCarga_horaria() {
		return ch;
	}
	public void setCarga_horaria(int carga_horaria) {
		this.ch = carga_horaria;
	}
	
	
}
