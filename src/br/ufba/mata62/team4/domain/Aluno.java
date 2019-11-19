package br.ufba.mata62.team4.domain;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Aluno {
	
	private String num_matricula;
	private String nome_aluno;
	private String periodo_ingresso;
	private Curso curso;
	private String contato;
	private ArrayList<AlunoDisciplina> disciplinas_cursadas;

	public ArrayList<AlunoDisciplina> getDisciplinas_cursadas() {
		return disciplinas_cursadas;
	}
	public void setDisciplinas_cursadas(ArrayList<AlunoDisciplina> disciplinas_cursadas) {
		this.disciplinas_cursadas = disciplinas_cursadas;
	}
	
	public String getNum_matricula() {
		return this.num_matricula;
	}
	public void setNum_matricula(String num_matricula) {
		this.num_matricula = num_matricula;
	}
	public String getNome() {
		return this.nome_aluno;
	}
	public void setNome(String nome) {
		this.nome_aluno = nome;
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
	
	public String getPeriodo_ingresso() {
		return periodo_ingresso;
	}
	public void setPeriodo_ingresso(String periodo_ingresso) {
		this.periodo_ingresso = periodo_ingresso;
	}
	
	
}
