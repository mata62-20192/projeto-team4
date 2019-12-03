package br.ufba.mata62.team4.domain;

import java.util.ArrayList;

public class Semestre {
	
	private String nomeSemestre;
	private ArrayList<ComponenteCurricular> disciplinas;
	private Curso curso;
	
	public Semestre(String nome_semestre, Curso curso) {
		this.curso = curso;
		this.nomeSemestre = nome_semestre;
		this.disciplinas = new ArrayList<ComponenteCurricular>();
	}

	public String getNome_semestre() {
		return nomeSemestre;
	}

	public void setNome_semestre(String nome_semestre) {
		this.nomeSemestre = nome_semestre;
	}

	public ArrayList<ComponenteCurricular> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<ComponenteCurricular> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void addDisciplina(ComponenteCurricular cmp) {
		this.disciplinas.add(cmp);
	}
}
