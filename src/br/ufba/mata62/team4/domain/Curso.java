package br.ufba.mata62.team4.domain;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Curso {
	
	private String codigo_curso;
	private String nome_curso;
	private ArrayList<Aluno> alunos;
	private ArrayList<Semestre> disc_obrigatorias;
	private ArrayList<ComponenteCurricular> disc_optativas;

	public Curso(String codigo, String nome) {
		super();
		this.alunos = new ArrayList<Aluno>();
		this.codigo_curso = codigo;
		this.codigo_curso = nome;
		this.disc_obrigatorias = new ArrayList<Semestre>();
		this.disc_optativas = new ArrayList<ComponenteCurricular>();
	}
	
	public ArrayList<Aluno> getAlunos(){
		return this.alunos;
	}
	
	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	
	public String getCodigo() {
		return codigo_curso;
	}
	public void setCodigo(String codigo) {
		this.codigo_curso = codigo;
	}
	public String getNome() {
		return codigo_curso;
	}
	public void setNome(String nome) {
		this.codigo_curso = nome;
	}
	public ArrayList<Semestre> getDisc_obrigatorias() {
		return disc_obrigatorias;
	}
	public void setDisc_obrigatorias(ArrayList<Semestre> disc_obrigatorias) {
		this.disc_obrigatorias = disc_obrigatorias;
	}
	public ArrayList<ComponenteCurricular> getDisc_optativas() {
		return disc_optativas;
	}
	public void setDisc_optativas(ArrayList<ComponenteCurricular> disc_optativas) {
		this.disc_optativas = disc_optativas;
	}
	
	
}
