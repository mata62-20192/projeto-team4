package entidades;

import java.util.ArrayList;

public class Universidade {
	private String nome_univ;
	private String sigla_univ;
	private ArrayList<Curso> cursos_univ;
	private ArrayList<Disciplina> disciplinas_univ;
	
	public Universidade() {
		
	}
	public String getNome() {
		return nome_univ;
	}
	public void setNome(String nome) {
		this.nome_univ = nome;
	}
	public String getSigla() {
		return sigla_univ;
	}
	public void setSigla(String sigla) {
		this.sigla_univ = sigla;
	}
	public ArrayList<Curso> getCursos() {
		return cursos_univ;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos_univ = cursos;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas_univ;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas_univ = disciplinas;
	}
	
	
}
