package entidades;

import java.util.ArrayList;

public class Semestre {
	private String nome_semestre;
	private ArrayList<ComponenteCurricular> disciplinas;
	private Curso curso;
	
	public Semestre(String nome_semestre, Curso curso) {
		this.curso = curso;
		this.nome_semestre = nome_semestre;
		this.disciplinas = new ArrayList<ComponenteCurricular>();
	}

	public String getNome_semestre() {
		return nome_semestre;
	}

	public void setNome_semestre(String nome_semestre) {
		this.nome_semestre = nome_semestre;
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
	
	
}
