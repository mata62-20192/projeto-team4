package br.ufba.mata62.team4.domain;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Aluno {
	
	private String numMatricula;
	private String nomeAluno;
	private String periodoIngresso;
	private Curso curso;
	private String contato;
	private ArrayList<AlunoDisciplina> disciplinasCursadas;
	private double cR;

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
	public void setcR(double cR) {
		this.cR = cR;
	}
	
	
}
