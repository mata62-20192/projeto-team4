package br.ufba.mata62.team4.domain;

import java.util.ArrayList;

public class Curso {
	
	private String codigoCurso;
	private String nomeCurso;
	private ArrayList<Aluno> alunos;
	private ArrayList<Semestre> discObrigatorias;
	private ArrayList<ComponenteCurricular> discOptativas;

	public Curso(String codigo, String nome) {
		super();
		this.alunos = new ArrayList<Aluno>();
		this.codigoCurso = codigo;
		this.codigoCurso = nome;
		this.discObrigatorias = new ArrayList<Semestre>();
		this.discOptativas = new ArrayList<ComponenteCurricular>();
	}
	
	public ArrayList<Aluno> getAlunos(){
		return this.alunos;
	}
	
	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public String getCodigo() {
		return codigoCurso;
	}
	
	public void setCodigo(String codigo) {
		this.codigoCurso = codigo;
	}
	
	public String getNome() {
		return codigoCurso;
	}
	
	public void setNome(String nome) {
		this.codigoCurso = nome;
	}
	
	public ArrayList<Semestre> getDiscObrigatorias() {
		return discObrigatorias;
	}
	
	public void setDisc_obrigatorias(ArrayList<Semestre> discObrigatorias) {
		this.discObrigatorias = discObrigatorias;
	}
	
	public ArrayList<ComponenteCurricular> getDiscOptativas() {
		return discOptativas;
	}
	
	public void setDisc_optativas(ArrayList<ComponenteCurricular> discOptativas) {
		this.discOptativas = discOptativas;
	}

	public void addDisciplinaCurso(ComponenteCurricular disciplinaCurso) {
		discOptativas.add(disciplinaCurso);
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
}
