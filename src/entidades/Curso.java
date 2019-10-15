package entidades;

import java.util.ArrayList;

public class Curso {
	
	private String codigo_curso;
	private String nome_curso;
	private ArrayList<ComponenteCurricular> disc_obrigatorias;
	private ArrayList<ComponenteCurricular> disc_optativas;

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
	public ArrayList<ComponenteCurricular> getDisc_obrigatorias() {
		return disc_obrigatorias;
	}
	public void setDisc_obrigatorias(ArrayList<ComponenteCurricular> disc_obrigatorias) {
		this.disc_obrigatorias = disc_obrigatorias;
	}
	public ArrayList<ComponenteCurricular> getDisc_optativas() {
		return disc_optativas;
	}
	public void setDisc_optativas(ArrayList<ComponenteCurricular> disc_optativas) {
		this.disc_optativas = disc_optativas;
	}
	public void addDisciplinaCurso(ComponenteCurricular disciplinaCurso) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
