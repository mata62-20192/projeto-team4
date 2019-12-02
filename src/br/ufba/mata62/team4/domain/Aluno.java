package br.ufba.mata62.team4.domain;

import java.util.ArrayList;

public class Aluno implements Comparable<Object>{
	
	private String numMatricula;
	private String nomeAluno;
	private String periodoIngresso;
	private Curso curso;
	private String contato;
	private ArrayList<AlunoDisciplina> disciplinasCursadas;
	private double cR;
	
	public Aluno(String nome, String matricula, Curso curso) {
		this.numMatricula = matricula;
		this.nomeAluno = nome;
		this.periodoIngresso = "2019.2";
		this.curso = curso;
		this.contato = "contato";
		this.disciplinasCursadas = new ArrayList<AlunoDisciplina>();
		this.cR = 0.0;
	}

	public ArrayList<AlunoDisciplina> getDisciplinasCursadas() {
		return disciplinasCursadas;
	}
	
	public void setDisciplinas_cursadas(ArrayList<AlunoDisciplina> disciplinasCursadas) {
		this.disciplinasCursadas = disciplinasCursadas;
	}
	
	public String getNum_matricula() {
		return this.numMatricula;
	}
	
	public void setNum_matricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}
	
	public String getNome() {
		return this.nomeAluno;
	}
	
	public void setNome(String nome) {
		this.nomeAluno = nome;
	}
	
	public String getContato() {
		return contato;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public String getPeriodoIngresso() {
		return periodoIngresso;
	}
	
	public void setPeriodo_ingresso(String periodoIngresso) {
		this.periodoIngresso = periodoIngresso;
	}
	
	public double getcR() {
		return cR;
	}
	
	public void setcR(double cr) {
		this.cR = cr;
	}
	
	public int compareTo(Object aluno) {
		if(this.getcR() < ((Aluno) aluno).getcR()) {
			return 1;
		}
		if(this.getcR() > ((Aluno) aluno).getcR()) {
			return -1;
		}
		return 0;
	}

	public void addDisciplina(AlunoDisciplina alunoDisciplina) {
		disciplinasCursadas.add(alunoDisciplina);
	}
}