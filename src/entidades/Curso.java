package entidades;

import java.util.ArrayList;

public class Curso {
	
	private String codigo_curso;
	private String nome_curso;
	private ArrayList<DisciplinaCurso> disc_obrigatorias;
	private ArrayList<DisciplinaCurso> disc_optativas;

	public Curso(String codigo, String nome) {
		super();
		this.codigo_curso = codigo;
		this.codigo_curso = nome;
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
	public ArrayList<DisciplinaCurso> getDisc_obrigatorias() {
		return disc_obrigatorias;
	}
	public void setDisc_obrigatorias(ArrayList<DisciplinaCurso> disc_obrigatorias) {
		this.disc_obrigatorias = disc_obrigatorias;
	}
	public ArrayList<DisciplinaCurso> getDisc_optativas() {
		return disc_optativas;
	}
	public void setDisc_optativas(ArrayList<DisciplinaCurso> disc_optativas) {
		this.disc_optativas = disc_optativas;
	}
	public void addDisciplinaCurso(DisciplinaCurso disciplinaCurso) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
