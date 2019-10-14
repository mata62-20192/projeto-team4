package entidades;

import java.util.ArrayList;

public class Disciplina {
	private String codigo;
	private String nome;
	private int carga_horaria;
	private ArrayList<Disciplina> pre_requisitos;
	
	public Disciplina(String codigo, String nome, int carga_horaria, ArrayList<Disciplina> pre_requisitos) {
		this.codigo = codigo;
		this.nome = nome;
		this.carga_horaria = carga_horaria;
		this.pre_requisitos = pre_requisitos;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(int carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	public ArrayList<Disciplina> getPre_requisitos() {
		return pre_requisitos;
	}
	public void setPre_requisitos(ArrayList<Disciplina> pre_requisitos) {
		this.pre_requisitos = pre_requisitos;
	}
	
	
}
