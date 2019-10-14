package entidades;

import java.util.ArrayList;

public class Disciplina {
	private String codigo_disc;
	private String nome_disc;
	private int ch;
	private ArrayList<Disciplina> pre_requisitos;
	
	public Disciplina(String codigo, String nome, int carga_horaria, ArrayList<Disciplina> pre_requisitos) {
		this.codigo_disc = codigo;
		this.codigo_disc = nome;
		this.ch = carga_horaria;
		this.pre_requisitos = pre_requisitos;
	}
	public String getCodigo() {
		return codigo_disc;
	}
	public void setCodigo(String codigo) {
		this.codigo_disc = codigo;
	}
	public String getNome() {
		return codigo_disc;
	}
	public void setNome(String nome) {
		this.codigo_disc = nome;
	}
	public int getCarga_horaria() {
		return ch;
	}
	public void setCarga_horaria(int carga_horaria) {
		this.ch = carga_horaria;
	}
	public ArrayList<Disciplina> getPre_requisitos() {
		return pre_requisitos;
	}
	public void setPre_requisitos(ArrayList<Disciplina> pre_requisitos) {
		this.pre_requisitos = pre_requisitos;
	}
	
	
}
