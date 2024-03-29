package br.ufba.mata62.team4.domain;

import java.util.ArrayList;

public class Universidade {
	
	private String nomeUniv;
	private String siglaUniv;
	private ArrayList<Curso> cursosUniv;
	private ArrayList<Disciplina> disciplinasUniv;
	
	public Universidade(String nome, String sigla) {
		this.nomeUniv = nome;
		this.siglaUniv = sigla;
		this.cursosUniv = new ArrayList<Curso>();
		this.disciplinasUniv = new ArrayList<Disciplina>();
	}
	
	public Universidade(String nomeUniv) {
		this.nomeUniv = nomeUniv;
	}
	
	public String getNome() {
		return nomeUniv;
	}
	
	public void setNome(String nome) {
		this.nomeUniv = nome;
	}
	
	public String getSigla() {
		return siglaUniv;
	}
	
	public void setSigla(String sigla) {
		this.siglaUniv = sigla;
	}
	
	public ArrayList<Curso> getCursos() {
		return cursosUniv;
	}
	
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursosUniv = cursos;
	}
	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinasUniv;
	}
	
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinasUniv = disciplinas;
	}
	
	public void addCurso(Curso curso) {
		this.cursosUniv.add(curso);		
	}
	
	public Disciplina findDisciplina(String codigoDisc) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addDisciplina(Disciplina disciplina) {
		this.disciplinasUniv.add(disciplina);
	}	
}