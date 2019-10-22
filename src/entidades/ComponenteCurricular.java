package entidades;

import java.util.ArrayList;

public class ComponenteCurricular {
	
	private Disciplina disciplina;
	private String semestre;
	private String natureza;
	private ArrayList<Disciplina> pre_requisitos;
	private Curso curso;
	
	
	public ComponenteCurricular(Disciplina disciplina, Curso curso, String natureza) {
		super();
		this.disciplina = disciplina;
		this.curso = curso;
		this.natureza = natureza;
		this.pre_requisitos = new ArrayList<Disciplina>();
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
	public ArrayList<Disciplina> getPre_requisitos() {
		return pre_requisitos;
	}
	public void setPre_requisitos(ArrayList<Disciplina> pre_requisitos) {
		this.pre_requisitos = pre_requisitos;
	}
	
}
