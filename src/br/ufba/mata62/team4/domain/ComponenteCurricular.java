package br.ufba.mata62.team4.domain;

import java.util.ArrayList;
import java.util.HashSet;

public class ComponenteCurricular {
	
	private Disciplina disciplina;
	private String semestre;
	private String natureza;
	private ArrayList<Disciplina> preRequisitos;
	private Curso curso;
	
	public ComponenteCurricular(Disciplina disciplina, Curso curso, String natureza) {
		super();
		this.disciplina = disciplina;
		this.curso = curso;
		this.natureza = natureza;
		this.preRequisitos = new ArrayList<Disciplina>();
	}
	
	public ComponenteCurricular(Disciplina disciplina2, int semestre2, String natureza2, HashSet<Disciplina> hashSet) {
		// TODO Auto-generated constructor stub
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public String getSemestre() {
		return semestre;
	}
	
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	public String getNatureza() {
		return natureza;
	}
	
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	
	public ArrayList<Disciplina> getPreRequisitos() {
		return preRequisitos;
	}
	
	public void setPre_requisitos(ArrayList<Disciplina> preRequisitos) {
		this.preRequisitos = preRequisitos;
	}
}
